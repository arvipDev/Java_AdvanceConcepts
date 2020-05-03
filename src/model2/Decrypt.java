package model2;

import java.math.BigInteger;
import java.util.List;

public class Decrypt {

    private static Decrypt decrypt;
    //private String message;

    private Decrypt () {}

    public static Decrypt getInstance(){
        if (decrypt == null)
            return new Decrypt();
        return decrypt;
    }

    public List<BigInteger> decrypt(List<BigInteger> message, List<BigInteger> receiverPublicKey){ //}, List<BigInteger> myPrivateKey){
        return null;
    }

    private List<BigInteger> decryption(List<BigInteger> encrypt, List<BigInteger> receiverPublicKey) {
        return null;
    }
}
