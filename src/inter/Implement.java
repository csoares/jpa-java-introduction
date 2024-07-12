package inter;

public class Implement implements MyCommonInterface {
    @Override
    public void test(int test) {
        System.out.println("test: " + test);
    }

    @Override
    public void test3(int test) {
        System.out.println("test3: " + test);
    }

    @Override
    public void test2(int test) {

    }

    public static void main(String[] args) throws Exception {
            new Testing().myMethod(1);
    }
}
