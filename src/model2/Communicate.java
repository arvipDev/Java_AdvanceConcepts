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
/*        List<BigInteger> mess = convert.stringToNumbers("How are you 1 #@");
        for (BigInteger value: mess){
            System.out.println(value);
        }
        System.out.println("===========================================");
        System.out.println(convert.numbersToString(mess));
        System.out.println("===========================================");*/

        Sender sender = new Sender();


        Encrypt encrypt = Encrypt.getInstance();
        List<BigInteger> encryptedMessage = encrypt.encrypt("Hello buddy", sender.getPublicKey());
        //for (BigInteger message: encryptedMessage)
            //System.out.println(message);

        sender.privateEncrypt(encryptedMessage);


    }

    private void createSender () {
        Communicator sender = new Sender();
    }
}
