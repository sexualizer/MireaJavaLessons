package Practice4.task_3;

public enum Food implements Product{
    APPLE(100, 1),
    BREAD(40, 2),
    MILK(70, 3),
    TEA(60, 4),
    EGGS(80, 5),
    CIGARETTES(120, 6),
    BEER(70, 7);
    private final int price, num;
    Food(int price, int num){
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
