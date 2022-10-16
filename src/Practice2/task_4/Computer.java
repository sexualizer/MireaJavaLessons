package Practice2.task_4;

public class Computer{

    private int ram;
    private int ssd;
    private String processor;

    public Computer(String processor, int ram, int ssd) {
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
    }
    public void setProcessor(String processor){
        this.processor = processor;
    }
    public String getProcessor(){
        return processor;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public int getRam(){
        return ram;
    }
    public void setSsd(int ssd){
        this.ssd = ssd;
    }
    public int getSsd(){
        return ssd;
    }
    @Override
    public String toString(){
        return "\nComputer{\t" +
                "\n\tprocessor:" + processor +
                "\n\tram:" + ram +
                "\n\tssd:" + ssd +
                "}";
    }
}
