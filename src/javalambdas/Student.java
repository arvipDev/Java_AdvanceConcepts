package javalambdas;

public class Student implements Comparable<Student> {

    private String name;
    private int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public int compareTo(Student student) {
        if(this.age > student.getAge())
            return -1;
        else if (this.age < student.getAge())
            return 1;
        return 0;
    }
}
