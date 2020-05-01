package model2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrimeGenerator {

    private Random random = new Random();

    public List<BigInteger> getPrimes(){
        return generatePrimes();
    }

    private List<BigInteger> generatePrimes() {
        List<BigInteger> privateKeys = new ArrayList<>();
        int value = generateRandomNumber();
        System.out.println(value);
        while (privateKeys.size() < 3){
            if (isPrime(value)){
                BigInteger bigInteger = new BigInteger(String.valueOf(value));
                privateKeys.add(bigInteger);
            }
            value = generateRandomNumber();
        }
        return privateKeys;
    }

    private boolean isPrime (int value){
        if (value % 2 == 0 || value % 3 == 0 || value < 0)
            return false;
        for (int i = 5; i*i <=value; i++){
            if (value % i == 0 || value % (i+2) == 0)
                return false;
        }
        return true;
    }

    private int generateRandomNumber (){
        int value;
        value = random.nextInt(1000000000);
        return value;
    }
}
