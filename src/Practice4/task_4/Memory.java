package Practice4.task_4;

public class Memory implements Able{
    @Override
    public void start() {
        System.out.println("Starting SSD, HDD, RAM...");
    }

    @Override
    public void shut() {
        System.out.println("Shutting off memory...");
        System.out.println("Clearing RAM...");
    }

    @Override
    public void show() {
        System.out.println("SSD 1Tb, HDD 256Gb, RAM 16Gb");
    }
}
