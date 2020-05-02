package model2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Sender implements Communicator  {

    private List<BigInteger> primes;

    private List<BigInteger> getPrivateKey () {
        KeyGenerator gen = PrivateKeyGenerator.getInstance();
        primes = gen.getKeys();
        //System.out.println("S private key " + primes.get(0));
        //System.out.println("S private key " + primes.get(1));
        // p and q are here
        List<BigInteger> privateKeys = new ArrayList<>(primes);
        return privateKeys;
    }

    public List<BigInteger> getPublicKey () {

        List<BigInteger> publicKeys = getPrivateKey();
        //System.out.println("S private key - " + primes.get(0));
        //System.out.println("S private key - " + primes.get(1));
        publicKeys.set(0, publicKeys.get(0).multiply(publicKeys.get(1)));
        SecondaryPrimeGenerator gen = new SecondaryPrimeGenerator();
        BigInteger secondaryKey = gen.getPrime();
        publicKeys.set(1, secondaryKey);
        // N and e are here !!!
        return publicKeys;
    }

    @Override
    public List<BigInteger> communicate () {
        return getPublicKey();
    }

    @Override
    public List<BigInteger> privateCrypt(List<BigInteger> publicEncryptedMessage, List<BigInteger> senderPublicKey) {
        //List<BigInteger> encryptedList = new ArrayList<>();
        BigInteger one = primes.get(0);
        one = one.multiply(primes.get(1));
        //System.out.println("in sender- " + primes.get(0) + " " + primes.get(1));
        one = one.pow(3);
        //System.out.println("in sender - " + one);
        for (int i = 0; i < publicEncryptedMessage.size(); i++){
            //System.out.println("private key encryption " + publicEncryptedMessage.get(i));
            publicEncryptedMessage.set(i, publicEncryptedMessage.get(i).add(one));
            //System.out.println("private key encryption " + publicEncryptedMessage.get(i));
        }
        return publicEncryptedMessage;
    }
}
