package javaregex;

public class Main {

    public static void main(String[] args) {

        String someString = "alsdbviabjvoaiwrpovnzs416846971safvabsv57s1f4asb";
        String saneString = "abcdefghijklmnopqrstuvwxyz1234567890";
        String spaceString = "My name is Arvind\tPurushotham. What's your name12345\n";
        String matcherString = "asbjfkiiiklsddddddldddkkkijjjdhhwgtsdjbbbviom";

        System.out.println("Boundary matcher carrot: " + saneString.replaceAll("^abc", "X"));
        System.out.println("Boundary matcher dollar: " + saneString.replaceAll("890$", "X"));
        System.out.println("replace all the a,b,c with X: " + someString.replaceAll("[abc]", "X"));
        System.out.println("replace all characters except a,b,c with X: " + someString.replaceAll("[^abc]", "X"));
        System.out.println("replace all the a,b,c followed by j,s with X: " + someString.replaceAll("[abc][js]", "X"));
        System.out.println("replace a to f or A to F or 1 to 5 with X: " + saneString.replaceAll("[a-fA-F1-5]", "X"));
        System.out.println("replace a to f or A to F or 1 to 5 with X using regex wildcards: " + saneString
                .replaceAll("(?i)[a-f1-5]", "X"));
        System.out.println("All numbers will be replaced: " + saneString.replaceAll("[0-9]", "X"));
        System.out.println("All numbers will be replaced: " + saneString.replaceAll("\\d", "X"));
        System.out.println("Everything except numbers will be replaced: " + saneString.replaceAll("\\D", "X"));
        System.out.println("String with white space" + spaceString);
        System.out.println("Removing white spaces: " + spaceString.replaceAll("\\s", ""));
        System.out.println("Replacing everything but white spaces with X: " + spaceString.replaceAll("\\S", "X"));
        System.out.println("Removing tab spaces: " + spaceString.replaceAll("\t\n", ""));
        System.out.println("Removing all alphabets, numbers and _: " + spaceString.replaceAll("\\w", ""));
        System.out.println("Removing everything else except alphabets, numbers and _: " + spaceString
                .replaceAll("\\W", ""));
        System.out.println("Surrounds each word with X: " + spaceString.replaceAll("\\b", "X"));
        System.out.println("Place X between each character of the string: " + spaceString.replaceAll("\\B", "X"));
        System.out.println("Replace all occurrence of k followed by 3 i: " + matcherString.replaceAll("ki{3}", "X"));
        System.out.println("Replace all occurrence of k followed by one or more i: " +
                matcherString.replaceAll("ki+", "X"));
        System.out.println("Replace all occurrence of k followed by none or any number of i: " +
                matcherString.replaceAll("ki*", "X"));
        System.out.println("Replace all occurrence of k followed by 2 to 5 i: " +
                matcherString.replaceAll("ki{2,5}", "X"));
        System.out.println("Replace all occurrence of k followed by one or more occurrence of i or none or any occurrence of j: " +
                matcherString.replaceAll("ki+j*", "X"));

    }
}
