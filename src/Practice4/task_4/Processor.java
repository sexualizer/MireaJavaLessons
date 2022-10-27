package Practice4.task_4;

public class Processor implements Able{

    @Override
    public void start() {
        System.out.println("Starting processor...");
    }

    @Override
    public void shut() {
        System.out.println("Shutting off the processor...");
    }

    @Override
    public void show() {
        System.out.println("3.6 GHz, 4 cores");
    }
}
