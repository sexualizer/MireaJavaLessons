package Practice4.task_3;

public enum Clothes implements Product{
    TSHIRT(300, 1),
    SHOES(1000, 2),
    SKIRT(1000, 3),
    TIE(500, 4),
    JEANS(800, 5),
    COAT(1200, 6);

    private final int price, num;
    Clothes(int price, int num){
        this.price = price;
        this.num = num;
    }
    public int getPrice(){
        return this.price;
    }
    public int getNum(){
        return this.num;
    }
}
