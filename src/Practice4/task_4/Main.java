package Practice4.task_4;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(Brand.MSI);
        computer.start();
        computer.show();
        computer.shut();
        computer.show();
    }
}
