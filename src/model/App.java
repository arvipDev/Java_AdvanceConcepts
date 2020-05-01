package model;

import java.math.BigInteger;
import java.util.List;

public class App {

    public static void main(String[] args) {
        PrimeGenerator generator = new PrimeGenerator();
        List<BigInteger> privateKeys = generator.getPrimes();
        System.out.println("pk1 " + privateKeys.get(0));
        System.out.println("pk2 " + privateKeys.get(1));
        System.out.println(privateKeys.size());


        PrivateKey privateKey = new PrivateKeyImpl();
        privateKey.generatePrivateKeys();
    }
}
