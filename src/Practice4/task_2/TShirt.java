package Practice4.task_2;

import java.sql.SQLOutput;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    @Override
    public void dressMan() {
        System.out.println("TShirt is on the man");
        System.out.println(this.size + " " + this.color + " " + this.price + "$");
    }
    public void dressWoman(){
        System.out.println("TShirt is on the woman");
    }
    public TShirt(Sizes size, double price, String color){
        super(size, price, color);
    };
}

