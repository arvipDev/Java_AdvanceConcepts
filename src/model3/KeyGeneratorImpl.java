package model3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class KeyGeneratorImpl implements KeyGenerator {

    private List<BigInteger> pKeys = new ArrayList<>();

    @Override
    public List<BigInteger> generateKeys() {
        return getKey();
    }

    @Override
    public BigInteger generateKey() {
        return getPhi();
    }

    @Override
    public BigInteger generateE(BigInteger range) {
        return getE(range);
    }

    @Override
    public BigInteger generateD(BigInteger phi, BigInteger e) {
        return getD(phi, e);
    }

    private List<BigInteger> getKey () {
        Keys keys = () -> {
            PrimeGenerator generate = new PrimeGenerator();
            pKeys = generate.getPrimes(100);
            // change bound value above
            return new ArrayList<>(pKeys);
        };
        return keys.generateKeys();
    }

    private BigInteger getPhi () {
        Key key = () -> {
            PrimeGenerator generator = new PrimeGenerator();
            return generator.getPhi(pKeys);
        };
        return key.getKey();
    }

    private BigInteger getE (BigInteger range) {
        Keys keys = () -> {
            PrimeGenerator generator = new PrimeGenerator();
            return new ArrayList<>(generator.getPrimes(range.intValue()));
        };
        return keys.generateKeys().get(0);
    }

    private BigInteger getD (BigInteger phi, BigInteger e) {
        int counter = 0;
        int comp = e.intValue();
        BigInteger numerator;
        while (counter < comp){
            numerator = calcNumerator(BigInteger.valueOf(counter), phi);
            if (numerator.mod(e).equals(BigInteger.ZERO)){
                return numerator.divide(e);
            }
            counter++;
        }
        return null;
    }

    private BigInteger calcNumerator(BigInteger counter, BigInteger phi) {
        BigInteger numerator = new BigInteger(String.valueOf(1));
        numerator = numerator.add(counter.multiply(phi));
        return numerator;
    }
}
