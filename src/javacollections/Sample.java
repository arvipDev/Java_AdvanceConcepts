package javacollections;

import java.util.HashMap;
import java.util.Map;

public class Sample {
    public static void main(String[] args) {
/*        List<String> names = new ArrayList<>();
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
        }*/

        System.out.println("----------------------------------------------------------");
        Map<String, String> data = new HashMap<>();
        data.put("Arvind", "Purushotham");
        data.put("Sneha", "Billinti");
        data.put("John ", "Stewart");
        System.out.println("----------------------------------------------------------");
        printMap(data);
        data.remove("Arvind");
        System.out.println("----------------------------------------------------------");
        printMap(data);
        System.out.println(data.containsKey("Alex"));
        data.replace("Sneha", "Arvind");
        System.out.println("----------------------------------------------------------");
        printMap(data);
        System.out.println(data.keySet());
        data.remove("Sneha", "Billinti");
        System.out.println("----------------------------------------------------------");
        printMap(data);



    }

    private static void printMap (Map<String, String> data) {
        for(String key: data.keySet()){
            System.out.println(key + " " + data.get(key));
        }
    }
}
