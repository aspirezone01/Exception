package exceptionExample;

public class MultiCatchExample {

    public static void main(String[] args){
        String name = null;

        int[] num = {10,20,60,70};

        try{

            System.out.println("Try block started");
            System.out.println(name.length());
            System.out.println(num[7]);

        }catch(NullPointerException n){

            System.out.println(n.getMessage());
            System.out.println("Object was null");

        }catch(ArrayIndexOutOfBoundsException a){

            System.out.println("Array size issue");

        }catch(Exception e){

            System.out.println("Something went wrong");
        }
        System.out.println("Program execution is working fine");

    }
}
