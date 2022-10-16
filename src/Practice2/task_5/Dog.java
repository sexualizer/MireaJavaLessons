package Practice2.task_5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public int getHumanAge(){
        return age * 7;
    }
    @Override
    public String toString(){
        return "(" + name + ", " + age + ")";
    }

}
