package model2;

import java.math.BigInteger;
import java.util.List;

public class PublicKeyGenerator extends KeyGenerator {
    //Dummy for now

    private static PublicKeyGenerator instance;

    private PublicKeyGenerator () {}

    public static PublicKeyGenerator getInstance () {
        if (instance == null) {
            instance = new PublicKeyGenerator();
            return instance;
        }
        return instance;
    }

    @Override
    public List<BigInteger> getKeys() {
        Sender sender = new Sender();
        List<BigInteger> primes = sender.getPublicKey();
        System.out.println("App pk " + primes.get(0));
        System.out.println("App pk " + primes.get(1));
        return primes;
                //Sender.getPublicKey();
    }

}
