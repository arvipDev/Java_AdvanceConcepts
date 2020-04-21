package comparablecomparator;

import java.util.*;

public class MainApp {

    private static List<Student> studentList = new ArrayList<>();

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
        System.out.println("Reverse the list ----------------------------------------------");
        Collections.reverse(studentList);
        printList(studentList);

        System.out.println("Professors list ----------------------------------------------");
        linkedList();

    }

    private static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getRollNo() + " " + student.getRank());
        }
    }

    private static void linkedList () {
        List<Professor> professors = new LinkedList<>();
        professors.add(new Professor("Jack", 156, 1));
        professors.add(new Professor("Jean", 89, 4));
        professors.add(new Professor("Martin", 249, 7));
        professors.add(new Professor("Rozki", 23, 2));
        professors.add(new Professor("Soon", 2, 99));
        professors.add(new Professor("Chung", 4, 129));
        printProf(professors);
        List<Professor> newProf = new LinkedList<>();
        newProf.addAll(professors);
        System.out.println("New Professors ----------------------------------------------");
        printProf(newProf);
    }

    private static void printProf (List<Professor> professors) {
        for (Professor professor : professors) {
            System.out.println(professor.getName() + " " + professor.getId() + " " + professor.getRank());
        }
    }
}
