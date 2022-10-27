package Practice4.task_2;

public class Skirt extends Clothes implements WomenClothing{
    @Override
    public void dressWoman() {
        System.out.println("A dress is on the woman");
        System.out.println(this.size + " " + this.color + " " + this.price + "$");
    }
    public Skirt(Sizes size, double price, String color){
        super(size, price, color);
    };
}
