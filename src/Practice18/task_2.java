package Practice18;

import java.util.Scanner;

public class task_2 {
    public static void ExceptionDemo(){
        Scanner in = new Scanner(System.in);
        System.out.print( "Enter an integer: ");
        String intString = in.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch(NumberFormatException numberFormatException){
            System.out.println("number format exception");
        } catch (ArithmeticException arithmeticException){
            System.out.println("arithmetic exception");
        }

    }

    public static void main(String[] args) {
        ExceptionDemo();
    }
}
