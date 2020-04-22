package javacollections;

import java.util.*;

public class Agency {

    private static Map<Driver, Car> agency = new HashMap<>();
    private static List<Driver> sort = new ArrayList<>();

    private static Map<Driver, Car> addBucket (String name, int exp, String make, int year) {
        Car car = new Car(make, year);
        Driver driver = new Driver(name, exp);
        agency.put(driver, car);
        return agency;
    }

    public static void printMap () {
        Iterator<Driver> iterator = agency.keySet().iterator();
        Driver driver;
        while (iterator.hasNext()){
            driver = iterator.next();
            sort.add(driver);
            System.out.println("Driver: " + driver.getName() + ", Car: " + agency.get(driver).getName());
        }
    }

    private static void sortMap () {
        sort.addAll(agency.keySet());
        Collections.sort(sort);
        int size = agency.size();
        Map<Driver, Car> sortedMap = new LinkedHashMap<>();

        for (int i = 0; i < size; i++){
            sortedMap.put(sort.get(i), agency.get(sort.get(i)));
        }

/*        for (Driver driver : sortedMap.keySet()) {
            System.out.println("Driver: " + driver.getName() + ", Car: " + agency.get(driver).getName());
        }
        */

        Set<Map.Entry<Driver, Car>> sortedSet = sortedMap.entrySet();
        for (Map.Entry<Driver, Car> mapElement : sortedSet) {
            System.out.println("Driver's name: " + mapElement.getKey().getName() + " Experience: " + mapElement.getKey().getExperience());
            System.out.println("Car model: " + mapElement.getValue().getName() + " Year of manufacture: " + mapElement.getValue().getModel());
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        addBucket("Arvind", 8, "Santro", 2016);
        addBucket("Karthikeyan", 4, "BMW", 2019);
        addBucket("Rick", 3, "MB", 2017);
        addBucket("Bob", 1, "Ferrari", 2010);
        addBucket("Dave", 15, "Ford", 2012);
        addBucket("Alex", 4, "Maruthi", 2008);
        //printMap();
        sortMap();
    }
}
