package javalambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        List<String> someList = Arrays.asList(
                "A01", "B29", "C59", "N97", "W20",
                "I19", "Z17", "M25", "K55", "V67",
                "A02", "A03", "A04", "A05", "A06"
        );

        someList.stream()
                .map(String::toUpperCase)          // Uses Function
                //same as s -> s.toUpperCase()
                .filter(s -> s.startsWith("A"))     // Uses Predicate
                .sorted()
                .forEach(System.out::println);      // Uses Consumer

        System.out.println("***********************************************");

        Stream<String> someStream = Stream.of("A02", "A03", "A04", "A05", "A06");
        Stream<String> someStream2 = Stream.of("I19", "Z17", "M25", "K55", "V67");
        Stream<String> concatStream = Stream.concat(someStream, someStream2);
        concatStream.distinct()
                .sorted()
                .peek(System.out::println)
                .count();


    }



}
