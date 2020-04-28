package javalambdas;

import java.util.function.Function;

public class FunctionExmaple {

    public static void main(String[] args) {

        System.out.println("Function using anonymous class");
        Function<Student, String> test = new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                return student.getName().toUpperCase();
            }
        };

        System.out.println("Function using lambda expressing");
        Function<Student, String> upperCase = (Student student) -> student.getName().toUpperCase();
        Function<String, String> lastName = (name) -> name.substring(name.indexOf(" "));
        Student student = new Student("Arvind Purushotham", 29);
        Function chainFunction = upperCase.andThen(lastName);
        System.out.println("Chained Function: " + chainFunction.apply(student));
        Function chainFunction2 = lastName.compose(upperCase);
        System.out.println("Chained Function 2: " + chainFunction2.apply(student));
    }
}
