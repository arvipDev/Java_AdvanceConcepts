package comparablecomparator;

import java.util.Comparator;

public class CompareName implements Comparator<Student> {

    @Override
    public int compare(Student studentOne, Student studentTwo) {
        return (studentOne.compareTo(studentTwo));
    }

    @Override
    public Comparator<Student> reversed() {
        return null;
    }
}

