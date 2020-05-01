package model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeGenerator {

    //private Random number = new Random(1000000000);

/*    private static PrimeGenerator instance;
    public PrimeGenerator () {}

    public static PrimeGenerator getInstance () {
        if (instance == null){
            instance = new PrimeGenerator();
            return instance;
        }
        return instance;
    }*/

    public List<BigInteger> getPrimes() {
        List<BigInteger> privateKeys = new ArrayList<>();
        Random number = new Random(1000000000);
        int value = generateRandomNumber(number);
        int counter = 0;

        while (counter < 2) {
            if (isPrime(value)){
                BigInteger big = new BigInteger(String.valueOf(value));
                privateKeys.add(counter, big);
                counter++;
            }
            value = generateRandomNumber(number);
        }
        return privateKeys;
    }

    private boolean isPrime (int value) {
        if (value % 2 == 0 || value % 3 == 0 || value < 0)
            return false;
        for (int i = 5; i*i <= value; i = i+6){
            if (value % i == 0 || value % (i+2) == 0)
                return false;
        }
        return true;
    }

    private int generateRandomNumber (Random number){
        int value;
        value = number.nextInt();
        System.out.println(value);
        return value;
    }

}
