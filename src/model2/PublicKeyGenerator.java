package model2;

import java.math.BigInteger;
import java.util.List;

public class PublicKeyGenerator extends KeyGenerator {

    private static PublicKeyGenerator instance;

    private PublicKeyGenerator () {}

    public static PublicKeyGenerator getInstance () {
        if (instance == null) {
            instance = new PublicKeyGenerator();
            return instance;
        }
        return instance;
    }

    @Override
    public List<BigInteger> getKeys() {
        return Sender.getPublicKey();
    }
}
