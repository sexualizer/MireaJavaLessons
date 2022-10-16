package Practice2.task_6;

public class Circle {
    private double d;
    private double r;
    private final double pi = 3.14;

    public Circle(double r){
        this.r = r;
        d = r * 2;
    }
    public void setRadius(double r){
        this.r = r;
        d = r * 2;
    }
    public double getRadius(){
        return r;
    }
    public void setDiameter(double d){
        this.d = d;
        d = r / 2.0;
    }
    public double getDiameter(){
        return d;
    }
    public double getSquare(){
        return pi * r * r;
    }
    public double getLength(){
        return pi * d;
    }
    public void compareCircles(Circle c2){
        if (this.d == c2.d) System.out.println("Circles are equal");
        else if (this.d > c2.d) System.out.println("This circle is bigger");
        else System.out.println("This circle is smaller");
    }
    @Override
    public String toString(){
        return "Circle{" +
                "\n\tr = " + getRadius() +
                "\n\td = " + d +
                "\n\ts = " + getSquare() +
                "\n\tl = " + getLength() +
                "}";
    }

}
