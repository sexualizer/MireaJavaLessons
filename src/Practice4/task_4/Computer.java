package Practice4.task_4;

public class Computer implements Able{
    private Brand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private boolean isOn;

    public Computer(Brand brand){
        this.processor = new Processor();
        this.memory = new Memory();
        this.monitor  = new Monitor();
        isOn = false;
        this.brand = brand;
    }
    public Brand getBrand(){
        return brand;
    }

    @Override
    public void start() {
        System.out.println("Computer is starting...");
        processor.start();
        memory.start();
        monitor.start();
        isOn = true;
        System.out.println("Computer is on");
    }

    @Override
    public void shut() {
        System.out.println();
        monitor.shut();
        processor.shut();
        memory.shut();
        isOn = false;
    }

    @Override
    public void show() {
        if (isOn){
            System.out.println(getBrand());
            processor.show();
            memory.show();
            monitor.show();
        }
        else System.out.println("Computer is shut");
    }

}
