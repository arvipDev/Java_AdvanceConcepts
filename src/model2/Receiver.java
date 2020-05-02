package model2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Receiver implements Communicator {

    private List<BigInteger> primes;

    private List<BigInteger> getPrivateKey () {
        KeyGenerator gen = PrivateKeyGenerator.getInstance();
        primes = gen.getKeys();
        //System.out.println("R private key " + primes.get(0));
        //System.out.println("R private key " + primes.get(1));
        // p and q are here
        return new ArrayList<>(primes);
    }

    public List<BigInteger> getPublicKey () {

        List<BigInteger> publicKeys = getPrivateKey();
        //System.out.println("R private key - " + primes.get(0));
        //System.out.println("R private key - " + primes.get(1));
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
    public List<BigInteger> privateCrypt(List<BigInteger> encryptedMessage, List<BigInteger> senderPublicKey) {
        //List<BigInteger> encryptedList = new ArrayList<>();
        BigInteger one = senderPublicKey.get(0);
        //System.out.println("in receiver- " + one);
        one = one.pow(3);
        //System.out.println("in receiver - " + one);
        for (int i = 0; i < encryptedMessage.size(); i++){
            //System.out.println("private key decryption " + encryptedMessage.get(i));
            encryptedMessage.set(i, encryptedMessage.get(i).subtract(one));
            //System.out.println("private key decryption " + encryptedMessage.get(i));
        }
        return encryptedMessage;
    }
}
