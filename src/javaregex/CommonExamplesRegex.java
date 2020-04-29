package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonExamplesRegex {

    public static void main(String[] args) {
        //phoneUSA();
        visaCard();
    }

    private static void phoneUSA () {
        String regex = "^([/+]1[/(][0-9]{3}[/)][ ][0-9]{3}[-][0-9]{4})$";

        String number = "+1(012) 123-4567";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);

        int count = 0;
        while(matcher.find()){
            System.out.println("Occurrence " + ++count + ": " + matcher.start() + " to " + matcher.end());
            System.out.println(matcher.group());
        }
        if (count == 0) System.out.println("Not Found");
    }

    private static void visaCard () {
        String regex = "^4[0-9]{3}[ ][0-9]{4}[ ][0-9]{4}([ ][0-9]{4})?$";
        String newCard = "4234 4532 5684 2451";
        String oldCard = "4234 4532 5684";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(newCard);
        int count = 0;
        while(matcher.find()){
            System.out.println("Occurrence " + ++count + ": " + matcher.start() + " to " + matcher.end());
            System.out.println(matcher.group());
        }
        if (count == 0) System.out.println("Not Found");
    }
}
