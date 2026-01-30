package exceptionExample.throwDemo;

public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        getName(105);
    }

    public static void getName(int id)throws Exception {
        if(id == 100) {
            System.out.println("Ajay");
        }
        else if(id == 101) {
            System.out.println("Vinay");
        }
        else{
            throw new CustomeException("UserNotFound");
        }
    }
}
