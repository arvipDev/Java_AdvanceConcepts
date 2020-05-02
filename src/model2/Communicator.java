package model2;

import java.math.BigInteger;
import java.util.List;

public interface Communicator {

    public List<BigInteger> communicate ();
    public List<BigInteger> privateCrypt(List<BigInteger> publicEncryptedMessage, List<BigInteger> senderPublicKey);
}
