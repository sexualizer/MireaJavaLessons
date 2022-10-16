package Practice18;

import java.util.Scanner;

public class task_3 {
    public static void ExceptionDemo(){
        Scanner in = new Scanner(System.in);
        System.out.print( "Enter an integer: ");
        String intString = in.next();
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        } catch(Exception exception){
            System.out.println("incorrect input");
        }

    }

    public static void main(String[] args) {
        ExceptionDemo();
    }
}
