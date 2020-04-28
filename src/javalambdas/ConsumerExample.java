package javalambdas;

import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        System.out.println("Consumer example - accept() call");
        Consumer<Student> consumer = student -> System.out.println(student.getName() + " " + student.getAge());
        consumer.accept(new Student("Arvind Purushotham", 29));

        System.out.println("Chained Consumer using andThen(-) and accept() ");
        Consumer<Student> consumer2 = student -> {
          String name = student.getName().substring(student.getName().indexOf(" "));
            System.out.println(name);
        };

        consumer.andThen(consumer2).accept(new Student("Alex Perish", 34));
    }
}
