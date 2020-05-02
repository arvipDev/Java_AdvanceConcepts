package model2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Encrypt {

    private static Encrypt encrypt;
    //private String message;

    private Encrypt () {}

    public static Encrypt getInstance(){
        if (encrypt == null)
            return new Encrypt();
        return encrypt;
    }

    public List<BigInteger> encrypt(String message, List<BigInteger> receiverPublicKey){ //}, List<BigInteger> myPrivateKey){
        Converter convert = new Converter();
        List<BigInteger> convertedList = convert.stringToNumbers(message);
        return encryption(convertedList, receiverPublicKey);
    }

    private List<BigInteger> encryption(List<BigInteger> encrypt, List<BigInteger> receiverPublicKey) {
        List<BigInteger> encryptedList = new ArrayList<>();
        BigInteger keyOne = receiverPublicKey.get(0);
        BigInteger keyTwo = receiverPublicKey.get(1);
        //System.out.println("keyOne " + keyOne);
        //System.out.println("keyTwo " + keyTwo);
        for (BigInteger bigInteger : encrypt) {
            if (bigInteger.intValue() != 0){
                //System.out.println("encrypting " + bigInteger);
                encryptedList.add(bigInteger.pow(keyTwo.intValue()));
            }
        }
        for (int i = 0; i < encryptedList.size(); i++) {
            BigInteger bigInteger = encryptedList.get(i);
            //System.out.println("encrypting two " + bigInteger);
            encryptedList.set(i, (bigInteger.divide(keyOne)));
        }
        return encryptedList;
    }
}
