public class TestStatic {

    static int counter = 0;

    {
        System.out.println(--counter);
    }

    static {
        System.out.println(counter = 100);
    }

    public TestStatic (int value) {
        counter = value;
        System.out.println(counter);
    }

    public static void doSomething () {
        counter++;
        System.out.println(counter);
    }

    public void doing () {
        counter++;
        System.out.println(counter);
    }
}
