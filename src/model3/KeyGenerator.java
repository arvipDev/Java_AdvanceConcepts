package model3;

import java.math.BigInteger;
import java.util.List;

public interface KeyGenerator {

    public List<BigInteger> generateKeys();

    public BigInteger generatePhi();

    public BigInteger generateE(BigInteger range);

    public BigInteger generateD(BigInteger phi, BigInteger e);

}
