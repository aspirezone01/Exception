package exceptionExample.thows;

public class ThrowsDemo {

    static void divide() throws ArithmeticException {
//        int a = 10 / 0;
        add();
    }

    static  void add()throws ArithmeticException{
        int a = 10/0;
    }

    public static void main(String[] args) throws Exception{
        System.out.println("Main start");
        try {
            divide();
        } catch (Exception e) {

        }
        // no handling
        System.out.println("Main end");
    }

}
