package Practice4.task_2;

public class Tie extends Clothes implements MenClothing{
    @Override
    public void dressMan() {
        System.out.println("A tie is on the man");
        System.out.println(this.size + " " + this.color + " " + this.price + "$");
    }
    public Tie(Sizes size, double price, String color){
        super(size, price, color);
    };
}
