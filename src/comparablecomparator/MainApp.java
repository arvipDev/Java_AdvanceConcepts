package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Arvind", 7, 21));
        studentList.add(new Student("Sneha", 16, 1));
        studentList.add(new Student("Avinash", 6, 3));
        studentList.add(new Student("Andrea", 5, 18));
        studentList.add(new Student("Aiyappa", 1, 22));
        studentList.add(new Student("Ashwini", 4, 2));
        studentList.add(new Student("Akash", 9, 27));
        System.out.println("Before sorting -------------------------------------------------");
        printList(studentList);
        Collections.sort(studentList);
        System.out.println("After sorting -------------------------------------------------");
        printList(studentList);
        System.out.println("Sorting by roll numbers using Comparator ----------------------");
        Collections.sort(studentList, new RollCompare());
        printList(studentList);
        System.out.println("Sorting by student name using Comparator ----------------------");
        Collections.sort(studentList, new NameCompare());
        printList(studentList);
    }

    private static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getRollNo() + " " + student.getRank());
        }
    }
}
