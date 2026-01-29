package exceptionExample;

public class ExceptionExample {

    public static void main(String[] args){

        int a = 10;
        int b = 0;
     try{
         System.out.println("Try block started");

         int c = a / b;

         System.out.println("try block ended");

         
     }
     catch(Exception e){

         System.out.println(e.getMessage());

         System.out.println("Catch block ended");

     }
        System.out.println("Main method ended");
    }

}
