package comparablecomparator;

import java.util.Comparator;

public class RollCompare implements Comparator<Student> {

    @Override
    public int compare(Student studentOne, Student studentTwo) {
        if (studentOne.getRollNo() < studentTwo.getRollNo()){
            return -1;
        } else if (studentOne.getRollNo() > studentTwo.getRollNo()) {
            return 1;
        }
        return 0;
    }

    @Override
    public Comparator<Student> reversed() {
        return null;
    }
}