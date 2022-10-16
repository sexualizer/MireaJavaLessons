package Practice2.task_3;

public class Circle {
    private Point center = new Point();
    Circle(){
        center.setXY(0, 0);
    }
    Circle(double x, double y){
        center.setXY(x, y);
    }
    @Override
    public String toString(){
        return "Circle{" +
                "\n\tx = " + center.getX() +
                "\n\ty = " + center.getY() +
                "\n}";
    }
}
