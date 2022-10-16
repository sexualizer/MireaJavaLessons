package Practice2.task_1;

public class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender){
        this.email = email;
        this.gender = gender;
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public char getGender(){
        return this.gender;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Author{" +
                "\n\tname = " + name +
                "\n\temail = " + email +
                "\n\tgender = " + gender +
                "\n}";
    }
}
