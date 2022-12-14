package Practice2.task_2;

public class Ball {
    private double x;
    private double y;

    Ball(double x, double y){
        this.x = x;
        this.y = y;
    }
    Ball(){
        x = 0;
        y = 0;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp){
        x += xDisp;
        y += yDisp;
    }
    @Override
    public String toString(){
        return "Ball{" +
                "\n\tx = " + x +
                "\n\ty = " + y +
                "\n}";
    }
}
