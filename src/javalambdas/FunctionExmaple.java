package javalambdas;

import java.util.function.Function;

public class FunctionExmaple {

    public static void main(String[] args) {

        //Function using anonymous class
        System.out.println("Function using anonymous class");
        Function<Student, String> test = new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName().toUpperCase();
            }
        };

        //Function using lambda expressing
        System.out.println("Function using lambda expressing");
        Function<Student, String> upperCase = (Student student) -> student.getName().toUpperCase();
        Function<String, String> lastName = (name) -> name.substring(name.indexOf(" "));
        Student student = new Student("Arvind Purushotham", 29);
        Function chainFunction = upperCase.andThen(lastName);
        System.out.println("Chained Function: " + chainFunction.apply(student));

    }
}
