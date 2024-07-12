package inter;

public class Testing {

    public void myMethod(int test) throws Exception {
        System.out.println("test: " + test);


            throw new Exception("Not implemented");

    }

    public void myMethod2(int test){
        System.out.println("test: " + test);

        try {
            this.myMethod(test);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
