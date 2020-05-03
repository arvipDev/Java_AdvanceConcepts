package model3;

import java.math.BigInteger;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Testing for P, Q and Phi: ");
        testPrimeGenerator();
        System.out.println("Test for P, Q and Phi: Success");
        System.out.println("*****************************************************************************");
        System.out.println("Testing for P, Q and Phi from KeyGeneratorImpl: ");
        testKeyGenerator();
        System.out.println("Testing for P, Q and Phi from KeyGeneratorImpl: Success ");
        System.out.println("*****************************************************************************");
        System.out.println("Testing for P, Q, Phi and E from KeyGeneratorImpl: ");
        testE();
        System.out.println("Testing for P, Q, Phi and E from KeyGeneratorImpl: Success ");
        System.out.println("*****************************************************************************");
        System.out.println("Testing for P, Q, Phi E and D from KeyGeneratorImpl: ");
        testD();
        System.out.println("Testing for P, Q, Phi E and D from KeyGeneratorImpl: Success ");
    }


    private static void testPrimeGenerator () {
        PrimeGenerator primes = new PrimeGenerator();
        List<BigInteger> pqList = primes.getPrimes(1000000000);
        System.out.println("Prime 1 " + pqList.get(0));
        System.out.println("Prime 2 " + pqList.get(1));
        System.out.println("Phi " + primes.getPhi(pqList));
    }

    private static void testKeyGenerator () {
        KeyGenerator keyGenerator = new KeyGeneratorImpl();
        List<BigInteger> pqList = keyGenerator.generateKeys();
        System.out.println("Prime 1 " + pqList.get(0));
        System.out.println("Prime 2 " + pqList.get(1));
        System.out.println("Phi " + keyGenerator.generateKey());
    }

    private static void testE () {
        KeyGenerator keyGenerator = new KeyGeneratorImpl();
        List<BigInteger> pqList = keyGenerator.generateKeys();
        System.out.println("Prime 1 " + pqList.get(0));
        System.out.println("Prime 2 " + pqList.get(1));
        BigInteger e = keyGenerator.generateKey();
        System.out.println("Phi " + e);
        System.out.println("E " + keyGenerator.generateE(e));
    }

    private static void testD () {
        KeyGenerator keyGenerator = new KeyGeneratorImpl();
        List<BigInteger> pqList = keyGenerator.generateKeys();
        System.out.println("Prime 1 " + pqList.get(0));
        System.out.println("Prime 2 " + pqList.get(1));
        BigInteger phi = keyGenerator.generateKey();
        System.out.println("Phi " + phi);
        BigInteger e = keyGenerator.generateE(phi);
        System.out.println("E " + e);
        System.out.println("D " + keyGenerator.generateD(phi, e));
    }

}
