package Practice18.task_6;

public class ThrowsDemo {
    public void printMessage(String key) {
        String message = new String();
        try{
            message = getDetails(key);
        }
        catch (NullPointerException e){
            System.out.println("null pointer exception");
        }
        System.out.println( message );
    }
    public String getDetails(String key) {
        if(key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " + key; }
}
