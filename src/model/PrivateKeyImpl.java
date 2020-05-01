package model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class PrivateKeyImpl implements PrivateKey {

    @Override
    public void generatePrivateKeys() {
        Keys key = () -> {
            System.out.println("test");
            List<BigInteger> big = new ArrayList<>();
            return big;
        };
        key.generateKeys();
    }
}
