package model;

import java.math.BigInteger;
import java.util.List;

@FunctionalInterface
public interface Keys {

    public  List<BigInteger> generateKeys ();
}
