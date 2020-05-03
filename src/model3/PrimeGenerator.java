package model3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeGenerator {
    // Tested successfully.

    private Random random = new Random();

    public List<BigInteger> getPrimes(int bound){
        return generatePrimes(bound);
    }

    private List<BigInteger> generatePrimes(int bound) {
        List<BigInteger> privateKeys = new ArrayList<>();
        int value = generateRandomNumber(bound);
        while (privateKeys.size() < 3){
            if (isPrime(value)){
                BigInteger bigInteger = new BigInteger(String.valueOf(value));
                privateKeys.add(bigInteger);
            }
            value = generateRandomNumber(bound);
        }
        return privateKeys;
    }

    private boolean isPrime (int value){
        if (value % 2 == 0 || value % 3 == 0 || value < 3)
            // change value < 3 to 100
            return false;
        for (int i = 5; i*i <=value; i++){
            if (value % i == 0 || value % (i+2) == 0)
                return false;
        }
        return true;
    }

    private int generateRandomNumber (int bound){
        int value = random.nextInt(bound);
        while (value < bound/2){
            value = random.nextInt(bound);
        }
        return value;
    }

    public BigInteger getPhi (List<BigInteger> pq) {
        return phiGenerator(pq);
    }

    private BigInteger phiGenerator (List<BigInteger> pq) {
        BigInteger one = new BigInteger(String.valueOf(1));
        BigInteger pMinusOne = pq.get(0).subtract(one);
        BigInteger qMinusOne = pq.get(1).subtract(one);
        return pMinusOne.multiply(qMinusOne);
    }
}
