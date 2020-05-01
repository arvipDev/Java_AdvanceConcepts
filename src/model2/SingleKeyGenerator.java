package model2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SingleKeyGenerator extends KeyGenerator {

    private static SingleKeyGenerator instance;

    private SingleKeyGenerator () {}

    public static SingleKeyGenerator getInstance () {
        if (instance == null) {
            instance = new SingleKeyGenerator();
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
            SecondaryPrimeGenerator generate = new SecondaryPrimeGenerator();
            List<BigInteger> keys = new ArrayList<>();
            keys.add(generate.getPrime());
            return keys;
        };
        return key.generateKeys();
    }
}
