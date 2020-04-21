package javacollections;

import java.util.ArrayList;
import java.util.List;

public class Cample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Arvind");
        names.add("Purushotham");
        names.add("Sneha");
        names.add("Billinti");

        for(String name: names){
            System.out.println(name);
        }

        System.out.println(names.size());
        System.out.println(names.get(1));
        names.add(1, "purushotham");
        System.out.println(names.get(1));
        //names.remove("Arvind");
        //names.remove(0);
        System.out.println(names.size());
        for(String name: names){
            System.out.println(name);
        }
    }
}
