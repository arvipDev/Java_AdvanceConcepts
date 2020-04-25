public class TestRandom {

    public static void main(String[] args) {
/*        int aplhaNum = 'A' + 25;
        int i = 1;
        System.out.println(aplhaNum);
        for (char row = 'A'; row <= aplhaNum; row++) {
            System.out.println(row + String.format("%02d", i++ ));
        }*/

        TestStatic test = new TestStatic(50);
        TestStatic.doSomething();
        test.doing();
        System.out.println(TestStatic.counter + 1);

    }





}
