package exceptionExample.throwDemo;

public class ExceptionExample {

    public static void main(String[] args) {

        int age = 15;
    try {
        if (age < 18) {

            throw new MyException("Must be equal to and greater than 18");
        }
    }catch(MyException e){
        System.out.println(e.getMessage());
    }
        System.out.println("Eligible for vote");
    }
}
