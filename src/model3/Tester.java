package model3;

import java.math.BigInteger;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Testing for P, Q and Phi: ");
        testPrimeGenerator();
        System.out.println("Test for P, Q and Phi: Success");
        System.out.println("*****************************************************************************");
        System.out.println("Testing for P, Q and Phi from KeyGeneratorImpl: ");
        testKeyGenerator();
        System.out.println("Testing for P, Q and Phi from KeyGeneratorImpl: Success ");
        System.out.println("*****************************************************************************");
        System.out.println("Testing for P, Q, Phi and E from KeyGeneratorImpl: ");
        testE();
        System.out.println("Testing for P, Q, Phi and E from KeyGeneratorImpl: Success ");
        System.out.println("*****************************************************************************");
        System.out.println("Testing for P, Q, Phi E and D from KeyGeneratorImpl: ");
        testD();
        System.out.println("Testing for P, Q, Phi E and D from KeyGeneratorImpl: Success ");
        System.out.println("*****************************************************************************");
        System.out.println("Testing communicator public key and private key: ");
        testCommunicator();
    }


    private static void testPrimeGenerator () {
        PrimeGenerator primes = new PrimeGenerator();
        List<BigInteger> pqList = primes.getPrimes(1000000000);
        System.out.println("Prime 1 " + pqList.get(0));
        System.out.println("Prime 2 " + pqList.get(1));
        System.out.println("Phi " + primes.getPhi(pqList));
    }

    private static void testKeyGenerator () {
        KeyGenerator keyGenerator = new KeyGeneratorImpl();
        List<BigInteger> pqList = keyGenerator.generateKeys();
        System.out.println("Prime 1 " + pqList.get(0));
        System.out.println("Prime 2 " + pqList.get(1));
        System.out.println("Phi " + keyGenerator.generatePhi());
    }

    private static void testE () {
        KeyGenerator keyGenerator = new KeyGeneratorImpl();
        List<BigInteger> pqList = keyGenerator.generateKeys();
        System.out.println("Prime 1 " + pqList.get(0));
        System.out.println("Prime 2 " + pqList.get(1));
        BigInteger e = keyGenerator.generatePhi();
        System.out.println("Phi " + e);
        System.out.println("E " + keyGenerator.generateE(e));
    }

    private static void testD () {
        KeyGenerator keyGenerator = new KeyGeneratorImpl();
        List<BigInteger> pqList = keyGenerator.generateKeys();
        System.out.println("Prime 1 " + pqList.get(0));
        System.out.println("Prime 2 " + pqList.get(1));
        BigInteger phi = keyGenerator.generatePhi();
        System.out.println("Phi " + phi);
        BigInteger e = keyGenerator.generateE(phi);
        System.out.println("E " + e);
        System.out.println("D " + keyGenerator.generateD(phi, e));
    }

    private static void testCommunicator() {
        KeyGenerator keyGenerator = new KeyGeneratorImpl();
        Communicator sender = new Communicator(keyGenerator);
        System.out.println("sender public key: " + sender.getMyPublicKey().get(0) + " " + sender.getMyPublicKey().get(1));
        System.out.println("sender private key: " + sender.getMyPrivateKey().get(0) + " " + sender.getMyPrivateKey().get(1));

        KeyGenerator keyGenerator2 = new KeyGeneratorImpl();
        Communicator receiver = new Communicator(keyGenerator2);
        System.out.println("receiver public key: " + receiver.getMyPublicKey().get(0) + " " + receiver.getMyPublicKey().get(1));
        System.out.println("receiver private key: " + receiver.getMyPrivateKey().get(0) + " " + receiver.getMyPrivateKey().get(1));

        sender.setupLink(receiver.getMyPublicKey());
        receiver.setupLink(sender.getMyPublicKey());

        System.out.println("Testing communicator public key and private key: Success ");
        System.out.println("*****************************************************************************");
        System.out.println("Testing encoding-Encrypting-Decrypting-decoding sequence ");

        System.out.println("Message: Hello How are you?" );
        List<BigInteger> encodedMessage = sender.encodeMessage("Hello How are you?");
        System.out.println("encoded message: " + encodedMessage);
        List<BigInteger> encryptedMessage = sender.getEncryptedMessage(encodedMessage);
        System.out.println("Encrypted message: " + encryptedMessage);
        List<BigInteger> decryptedMessage = receiver.getDecryptedMessage(encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
        System.out.println("decoded message: " + receiver.decodeMessage(decryptedMessage));

        System.out.println("Testing encoding-Encrypting-Decrypting-decoding sequence: Success ");
        System.out.println("*****************************************************************************");
        System.out.println("Testing second layer Encrypting-Decrypting sequence: ");




    }
}
