package javalambdas;


import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int value = input.nextInt();
        Predicate<Integer> lesserThan = data -> (data < 10);
        Predicate<Integer> greaterThan = data -> (data > 20);

        System.out.println("Is it lesser than 10: " + lesserThan.test(value));
        System.out.println("Is it greater than 20: " + greaterThan.test(value));

        // chained predicate
        System.out.println("Is it lesser than 10 and greater than 20: " +
                lesserThan.and(greaterThan).test(value));
        System.out.println("Is it greater than 10 and lesser than 20: " +
                lesserThan.and(greaterThan).negate().test(value));

        // passing predicate as argument.
        doSomething(value, i -> (i < 10));
        System.out.println("Enter a name to check");
        String me = input.next();
        System.out.println(doSomethingElse(me));

        System.out.println("IntPredicate usage-----------------------------");
        intPredicate();

    }

    // predicate as function parameter
    private static void doSomething(int value, Predicate<Integer> predicate) {
        System.out.println("is " + value + " lesser than 10: " + predicate.test(value));
    }



    private static boolean doSomethingElse (String name) {
        Predicate<String> checkString = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 10;
            }
        };

        System.out.println("Checking if the name is longer than 10 characters or if it contains A in it");
        Predicate<String> orPredicate = na -> na.contains("A");
        return orPredicate.or(checkString).test(name);
    }

    private static void intPredicate () {
        IntPredicate pred = i -> i < 10;
        System.out.println(pred.test(9));
    }
}
