package javaregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherRegex {

    public static void main(String[] args) {
        //pattern();
        //patternMatcherRegex();
        groupRegex();
    }

    private static void pattern() {

        StringBuilder string = stringBuilder();
        String find = ".*doing.*";
        String find2 = "How are";
        Pattern pattern = Pattern.compile(find);
        Matcher match = pattern.matcher(string);


        Pattern pattern2 = Pattern.compile(find2);
        Matcher match2 = pattern2.matcher(string);

        System.out.println(match.matches());
        System.out.println(match2.matches());
    }

    private static StringBuilder stringBuilder () {
        StringBuilder string = new StringBuilder("Hello How are you");
        string.append("1I am doing good, how are you?2");
        string.append("1I am doing good, how are you two?2");
        string.append("1I am doing good, how are you all?2");
        string.append("1We are all doing good, thank you2");
        return string;
    }

    private static void patternMatcherRegex() {

        StringBuilder string = stringBuilder();
        String find = "doing";
        int counter = 0;

        Pattern pattern = Pattern.compile(find);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()){
            counter++;
            System.out.println("Occurrence: " + counter + " - " + matcher.start() + " to " + matcher.end());
        }
        System.out.println(string);

        matcher.reset();
        while (matcher.find()){
            counter++;
            System.out.println("Occurrence: " + matcher.replaceAll("DOING"));
        }
    }

    private static void groupRegex () {
        StringBuilder string = stringBuilder();
        String find = "(1.*?2)";
        int counter = 0;

        Pattern pattern = Pattern.compile(find);
        Matcher matcher = pattern.matcher(string);

        while (matcher.find()){
            counter++;
            System.out.println("Occurrence: " + counter + " - " + matcher.group(0));
        }
        System.out.println("=========================================================================");

        String find2 = "(1)(.+?)(2)";
        Pattern pattern2 = Pattern.compile(find2);
        Matcher matcher2 = pattern2.matcher(string);

        counter = 0;
        while (matcher2.find()){
            counter++;
            System.out.println("Occurrence: " + counter + " - " + matcher2.group(0));
        }
    }
}
