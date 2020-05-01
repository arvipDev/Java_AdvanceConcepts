package model2;

import java.math.BigInteger;
import java.util.List;

public class Sender implements Communicator  {

    public Sender() {
        getPrivateKey();
        encryptMessage();
        createPacket();
    }

    private List<BigInteger> getPrivateKey () {
        KeyGenerator gen = PrivateKeyGenerator.getInstance();
        List<BigInteger> primes = gen.getKeys();
        System.out.println("App " + primes.get(0));
        System.out.println("App " + primes.get(1));
        return primes;
    }

    public static List<BigInteger> getPublicKey () {
        Sender communicate = new Sender();
        List<BigInteger> primes = communicate.getPrivateKey();
        BigInteger publicKey = primes.get(1).add(primes.get(0));
        primes.clear();
        primes.add(publicKey);
        System.out.println(primes.size());
        // add one more key for calculation
        return primes;
    }

    private void encryptMessage () {
        // code to encrypt
    }

    private void createPacket () {
        // encrypted message + public keys
    }

    @Override
    public void communicate () {
        //createPacket(); if nothing
    }
}
