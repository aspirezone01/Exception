package exceptionExample.throwDemo;

public class ExceptionExample1 {

    public static void main(String[] args) throws Exception{

        getName(1);
        getName(2);
        getName(3);
        getName(4);

    }

    public static void getName(int id) throws Exception {

        if (id == 1) {

         System.out.println("Imdad");

        }else if(id == 2){

            System.out.println("Saud");

        }else if(id== 3){

            System.out.println("Tarique");

        }else{

            throw new MyException1("Invalid user id");
        }
    }
}