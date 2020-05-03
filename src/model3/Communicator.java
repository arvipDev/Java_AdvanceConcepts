package model3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Communicator {

    //private List<BigInteger> pKey = new ArrayList<>();
    private List<BigInteger> myPublicKey;
    private List<BigInteger> communicatedPublicKey;
    private List<BigInteger>  privateKey;
    private KeyGenerator keyGenerator;

    public Communicator (KeyGenerator keyGenerator) {
        //this.keyGenerator = KeyGeneratorImpl.getInstance();
        this.keyGenerator = keyGenerator;
        this.myPublicKey = publicKey();
        this.privateKey = privateKey();
    }

    public List<BigInteger> getMyPublicKey() {
        return myPublicKey;
    }

    // remove this method to deploy
    public List<BigInteger> getMyPrivateKey() {
        return privateKey;
    }

    private List<BigInteger> publicKey () {
        List<BigInteger> publicKey;
        publicKey = keyGenerator.generateKeys();
        publicKey.set(0, publicKey.get(0).multiply(publicKey.get(1)));
        BigInteger phi = keyGenerator.generatePhi();
        BigInteger e = keyGenerator.generateE(phi);
        publicKey.set(1, e);

        privateKey = keyGenerator.generateKeys();
        privateKey.set(0, privateKey.get(0).multiply(privateKey.get(1)));
        BigInteger d = keyGenerator.generateD(phi, e);
        privateKey.set(1, d);
        return publicKey;
    }

    private List<BigInteger> privateKey () {
        return this.privateKey;
    }

    public List<BigInteger> encodeMessage (String message){
        EncodeDecode scramble = new EncodeDecode();
        return scramble.stringToNumbers(message);
    }

    public String decodeMessage (List<BigInteger> list){
        EncodeDecode scramble = new EncodeDecode();
        return scramble.numbersToString(list);
    }

    public void setupLink (List<BigInteger> otherPublicKey) {
        this.communicatedPublicKey = otherPublicKey;
    }

    public List<BigInteger> getEncryptedMessage (List<BigInteger> encodedMessage){
        return encryptedMessage(encodedMessage);
    }

    public List<BigInteger> getDecryptedMessage (List<BigInteger> encodedMessage){
        return decryptedMessage(encodedMessage);
    }

    private List<BigInteger> encryptedMessage (List<BigInteger> encodedMessage) {
        List<BigInteger> encryptedMessage = new ArrayList<>();
        BigInteger e = communicatedPublicKey.get(1);
        BigInteger temp;
        for (BigInteger bigInteger : encodedMessage) {
            temp = bigInteger.pow(e.intValue());
            encryptedMessage.add(temp.mod(communicatedPublicKey.get(0)));
        }
        return encryptedMessage;
    }

    private List<BigInteger> decryptedMessage (List<BigInteger> encryptedMessage) {
        List<BigInteger> decryptedMessage = new ArrayList<>();
        BigInteger e = privateKey.get(1);
        BigInteger temp;
        for (BigInteger bigInteger : encryptedMessage) {
            temp = bigInteger.pow(e.intValue());
            decryptedMessage.add(temp.mod(privateKey.get(0)));
        }
        return decryptedMessage;
    }


}
