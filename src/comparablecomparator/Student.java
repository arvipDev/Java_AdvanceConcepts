package comparablecomparator;

public class Student implements Comparable<Student> {

    private String name;
    private int rollNo;
    private int rank;

    public Student(String name, int rollNo, int rank) {
        this.name = name;
        this.rollNo = rollNo;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public int compareTo(Student student) {
        if (this.rank < student.rank){
            return -1;
        } else if (this.rank > student.rank) {
            return 1;
        }
        return 0;
    }
}
