package model2;

import java.math.BigInteger;
import java.util.List;

public class Communicate {


    private List<BigInteger> receiverPublicKeys;
    private List<BigInteger> senderPublicKeys;
    private Communicator sender;
    private Communicator receiver;

    private List<BigInteger> encryptedMessage;
    private static List<BigInteger> staticEncryptedMessage;

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

/*        Sender sender = new Sender();


        Encrypt encrypt = Encrypt.getInstance();
        List<BigInteger> encryptedMessage = encrypt.encrypt("Hello buddy", sender.getPublicKey());
        //for (BigInteger message: encryptedMessage)
            //System.out.println(message);

        sender.privateCrypt(encryptedMessage);*/

        Communicate communicate = new Communicate();
        communicate.sendMessage("Testing coding...");
        communicate.deletAfterUse(communicate);

    }

    private Communicator createSender () {
        sender = new Sender();
        senderPublicKeys = sender.communicate();
        return sender;
    }

    private Communicator createReceiver () {
        receiver = new Receiver();
        receiverPublicKeys = receiver.communicate();
        return receiver;
    }

    public void handShake () {
        sender = createSender();
        receiver = createReceiver();
    }

    public List<BigInteger> sendMessage (String message) {
        handShake();
        System.out.println("inside sendMessage ");
        Encrypt encrypt = Encrypt.getInstance();
        encryptedMessage = encrypt.encrypt(message, receiverPublicKeys);
        //System.out.println("here 2 " + encryptedMessage.size());
        encryptedMessage = sender.privateCrypt(encryptedMessage, senderPublicKeys);
        //System.out.println("here 3 " + encryptedMessage.size());
        //for (BigInteger bigInteger : encryptedMessage) System.out.println(bigInteger);
        return encryptedMessage;
    }

    private void deletAfterUse (Communicate communicate) {
        communicate.receiveMessage(encryptedMessage);
    }

    public void receiveMessage (List<BigInteger> encryptedMessage) {
        System.out.println("senderPublicKey " + senderPublicKeys.get(0) + " " + senderPublicKeys.get(1));
        System.out.println("receiveMessage ");
        encryptedMessage = receiver.privateCrypt(encryptedMessage, senderPublicKeys);
        for (BigInteger bigInteger : encryptedMessage) System.out.println(bigInteger);
    }

}
