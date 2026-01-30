package exceptionExample.TryCatch;

public class example2 {

    public static void main(String[] args){

        int [] arr = {10,20,30,40,50};
        try{

            System.out.println("Try block started");
            System.out.println(arr[5]);

        }catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Catch block started");
            System.out.println(e.getMessage());
            System.out.println("catch block ended");
        }catch(Exception e){

            System.out.println(e.getMessage());
        }
        System.out.println("Program Execution flow is working fine");
    }
}
