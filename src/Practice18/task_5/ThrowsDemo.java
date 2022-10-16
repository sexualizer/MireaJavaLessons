package Practice18.task_5;

public class ThrowsDemo {
    public void getDetails(String key) {
        try{
            if(key == null) {
                throw new NullPointerException("null key in getDetails" );
            }
        } catch(NullPointerException e){
            System.out.println("caught");
        }
        // do something with the key
    }
}
