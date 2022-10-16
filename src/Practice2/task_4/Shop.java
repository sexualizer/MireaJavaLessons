package Practice2.task_4;

import java.util.ArrayList;

public class Shop implements Able{
    private ArrayList<Computer> computers;
    private int max;
    private int cur;

    public Shop(int n){
        computers = new ArrayList<>(n);
        max = n;
        cur = 0;
    }
    public void addComputer(Computer computer){
        if (cur < max){
            computers.add(computer);
            cur++;
        }
        else{
            System.out.println("No more space");
        }
    }
    public void removeComputer(Computer computer){
        if (cur > 0){
            computers.remove(computer);
            cur--;
        }
        else{
            System.out.println("Nothing to remove");
        }
    }
    public Computer searchComputer(String processor, int ram, int ssd){
        for (Computer computer : computers){
            if (computer.getRam() == ram && computer.getProcessor() == processor && computer.getSsd() == ssd){
                return computer;
            }
        }
        return null;
    }
    public Computer createComputer(String processor, int ram, int ssd){
        return new Computer(processor, ram, ssd);
    }
    @Override
    public String toString(){
        return "\nShop:\n" + computers;
    }
}
