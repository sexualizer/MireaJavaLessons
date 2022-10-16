package Practice18.task_7;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in);
        String key = myScanner.next();
        try{
            printDetails( key );
        }
        catch(Exception e){
            System.out.println("exception's caught");
        }
    }
    public void printDetails(String key) throws Exception {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            throw e;
        }
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("0")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}
