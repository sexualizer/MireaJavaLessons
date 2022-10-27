package Practice4.task_2;

public abstract class Clothes {
    protected Sizes size;
    protected double price;
    protected String color;
    public Clothes(){}

    public Clothes(Sizes size, double price, String color) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }
}
