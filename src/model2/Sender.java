package model2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Sender implements Communicator  {

    private List<BigInteger> primes;

    public Sender() {

        //encryptMessage();
        //createPacket();
    }

    private List<BigInteger> getPrivateKey () {
        KeyGenerator gen = PrivateKeyGenerator.getInstance();
        primes = gen.getKeys();
        System.out.println("App " + primes.get(0));
        System.out.println("App " + primes.get(1));
        // p and q are here
        return primes;
    }

    public List<BigInteger> getPublicKey () {

        List<BigInteger> publicKeys = getPrivateKey();
        publicKeys.set(0, publicKeys.get(0).add(publicKeys.get(1)));
        SecondaryPrimeGenerator gen = new SecondaryPrimeGenerator();
        BigInteger secondaryKey = gen.getPrime();
        publicKeys.set(1, secondaryKey);
        // N and e are here !!!
        return publicKeys;
    }

    private void encryptMessage () {
        // code to encrypt
        getPrivateKey();
        getPublicKey();
    }

    private void createPacket () {
        // encrypted message + public keys
    }

    @Override
    public void communicate () {
        //createPacket(); if nothing
    }

    public List<BigInteger> privateEncrypt (List<BigInteger> publicEncryptedMessage) {
        List<BigInteger> encryptedList = new ArrayList<>();
        BigInteger one = primes.get(0);
        one = one.add(primes.get(1));
        System.out.println("private key added " + one);
        return encryptedList;
    }
}
