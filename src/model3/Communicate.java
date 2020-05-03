package model3;

public class Communicate {

    private static Communicate instance;

    private Communicate () {}

    public static Communicate getInstance(){
        if (instance == null)
            instance = new Communicate();
        return instance;
    }

    private void handShake () {
        Communicator sender = new Communicator(new KeyGeneratorImpl());
        Communicator receiver = new Communicator(new KeyGeneratorImpl());
    }

}
