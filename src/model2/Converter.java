package model2;

import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

public class Converter {

    public List<BigInteger> stringToNumbers (String message) {
        List<BigInteger> convertedMessage = new LinkedList<>();
        for (int i = 0; i < message.length(); i++){
            int convert = message.charAt(i);
            convertedMessage.add(new BigInteger(String.valueOf(convert)));
        }
        return convertedMessage;
    }

    public String numbersToString (List<BigInteger> message) {
        StringBuilder buider = new StringBuilder();
        int number;
        char mess;
        for (int i = 0; i < message.size(); i++){
            number = message.get(i).intValue();
            mess = (char) number;
            buider.append(mess);
        }
        return buider.toString();
    }
}
