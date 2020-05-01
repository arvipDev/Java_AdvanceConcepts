package model2;

import java.math.BigInteger;
import java.util.List;

public class PrivateKeyGenerator extends KeyGenerator{

    // uses keys lambda to implement prime generators
    // is a singleton that is called in PrivateKey class

    private static PrivateKeyGenerator instance;

    private PrivateKeyGenerator () {}

    public static PrivateKeyGenerator getInstance () {
        if (instance == null) {
            instance = new PrivateKeyGenerator();
            return instance;
        }
        return instance;
    }

    @Override
    public List<BigInteger> getKeys () {
        return generateKey();
    }

    private List<BigInteger> generateKey () {
        Keys key = () -> {
            PrimeGenerator generate = new PrimeGenerator();
            List<BigInteger> keys = generate.getPrimes();
            return keys;
        };
        return key.generateKeys();
    }




}
