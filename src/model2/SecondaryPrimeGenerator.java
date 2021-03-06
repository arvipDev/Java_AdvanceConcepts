package model2;

import java.math.BigInteger;
import java.util.Random;

public class SecondaryPrimeGenerator {

    private Random random = new Random();


    public BigInteger getPrime(){
        return generatePrime();
    }

    private BigInteger generatePrime () {
        int value = generateRandomNumber();
        while(!isPrime(value)) {
            value = generateRandomNumber();
        }
        return new BigInteger(String.valueOf(value));
    }

    private boolean isPrime (int value){
        if (value % 2 == 0 || value % 3 == 0)
            return false;
        for (int i = 5; i*i <=value; i++){
            if (value % i == 0 || value % (i+2) == 0)
                return false;
        }
        return true;
    }

    private int generateRandomNumber (){
        int value;
        value = random.nextInt(50);
        while (value < 3){
            value = random.nextInt(50);
        }
        return value;
    }
}
