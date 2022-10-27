package Practice4.task_4;

public class Monitor implements Able{
    @Override
    public void start() {
        System.out.println("Starting monitor...");
    }

    @Override
    public void shut() {
        System.out.println("Shutting off the monitor...");
    }

    @Override
    public void show() {
        System.out.println("ACER 18.5\", 1366x768, 75Hz");
    }
}
