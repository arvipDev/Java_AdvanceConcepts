package javacollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetFunctions {

    public static void main(String[] args) {
        Integer[] one = {1, 3, 5, 7, 9};
        Integer[] two = {2, 4, 6, 8, 10};
        Integer[] three = {3, 4, 8, 9};

        Set<Integer> setOne = new HashSet<>(Arrays.asList(one));
        Set<Integer> setTwo = new HashSet<>(Arrays.asList(two));
        Set<Integer> setThree = new HashSet<>(Arrays.asList(three));

        Set<Integer> union = new HashSet<>(setOne);
        union.addAll(setTwo);
        union.addAll(setThree);
        System.out.println("Union of sets: " + union);

        Set<Integer> intersection = new HashSet<>(setOne);
        //intersection.retainAll(setTwo);
        intersection.retainAll(setThree);
        System.out.println("Intersection of sets: " + intersection);


        Set<Integer> symDifference = new HashSet<>(setOne);
        //symDifference.retainAll(setTwo);
        symDifference.removeAll(setThree);
        System.out.println("Symmetric Difference of sets: " + symDifference);

        Set<Integer> asymDifference = new HashSet<>(symDifference);
        Set<Integer> rhs = new HashSet<>(setThree);
        rhs.removeAll(setOne);
        asymDifference.addAll(rhs);
        System.out.println("Asymmetric Difference of set one and set two: " + asymDifference);

        union.removeAll(intersection);
        System.out.println("Asymmetric Difference of all 3 sets: " + union);




    }
}
