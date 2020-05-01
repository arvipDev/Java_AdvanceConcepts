package model2;

import java.math.BigInteger;
import java.util.List;

public class Communicate {


    public static void main(String[] args) {
/*        Communicator sender = new Sender();
        Communicator receiver = new Receiver();
        List<BigInteger> senderPublicKey = ((Sender) sender).getPublicKey();
        System.out.println("Comm " + senderPublicKey.get(0));
        System.out.println("Comm " + senderPublicKey.get(1));

        List<BigInteger> receiverPublicKey = ((Receiver) receiver).getPublicKey();
        System.out.println("Comm " + receiverPublicKey.get(0));
        System.out.println("Comm " + receiverPublicKey.get(1));*/

        Converter convert = new Converter();
        List<BigInteger> mess = convert.stringToNumbers("How are you");
        for (BigInteger value: mess){
            System.out.println(value);
        }
        System.out.println("===========================================");
        System.out.println(convert.numbersToString(mess));

    }

    private void createSender () {
        Communicator sender = new Sender();
    }
}
