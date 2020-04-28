package javalambdas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Arvind", 29));
        students.add(new Student("Alex", 38));
        students.add(new Student("Mathew", 43));
        students.add(new Student("John", 26));
        students.add(new Student("Shiva", 31));
        students.add(new Student("Sagar", 55));
        students.add(new Student("Mark", 21));

        students.forEach(student -> System.out.println(student.getName() + ", " + student.getAge()));
        System.out.println("After sorting---------------------");
        Collections.sort(students);
        students.forEach(student -> System.out.println(student.getName() + ", " + student.getAge()));
        System.out.println("Sorting using anonymous class---------------------");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if(s1.getAge() < s2.getAge()) return -1;
                if (s1.getAge() > s2.getAge()) return 1;
                return 0;
            }
        });
        students.forEach(student -> System.out.println(student.getName() + ", " + student.getAge()));
        System.out.println("Sorting using lambda expression---------------------");
        Collections.sort(students, (s1, s2) -> {
            if(s1.getAge() > s2.getAge()) return -1;
            if (s1.getAge() < s2.getAge()) return 1;
            return 0;
        });
        students.forEach(student -> System.out.println(student.getName() + ", " + student.getAge()));
        System.out.println("Sorting using lambda expression 2---------------------");
        students.sort((s1, s2) -> Integer.compare(s2.getAge(), s1.getAge()));
        students.forEach(student -> System.out.println(student.getName() + ", " + student.getAge()));


        System.out.println("Running thread using Runnable interface---------------------");
        Thread thread = new Thread(() -> System.out.println("Running from lambda"));
        thread.start();

        System.out.println("Running thread using Runnable interface 2---------------------");
        new Thread(() -> {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("lambda thread 1");
            System.out.println("lambda thread 2");
            System.out.println("lambda thread 3");
        }).start();
    }
}
