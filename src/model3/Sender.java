package model3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Sender {

    private List<BigInteger> pKey = new ArrayList<>();
    private List<BigInteger> publicKey = new ArrayList<>();


    public void setPrivateKey (List<BigInteger> privateKey) {
        this.pKey = privateKey;
    }

    public void setPublicKey (List<BigInteger> publicKey) {
        this.pKey = publicKey;
    }

    public List<BigInteger> getPublicKey() {
        return publicKey;
    }


}
