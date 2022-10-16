package Practice2.task_4;

public interface Able {
    public void addComputer(Computer computer);
    public void removeComputer(Computer computer);
    public Computer searchComputer(String processor, int ram, int ssd);
    public Computer createComputer(String processor, int ram, int ssd);

}
