package Practice2.task_2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Ball ball1 = new Ball();
        System.out.println(ball1);
        while(in.hasNextDouble()){
            ball1.move(in.nextDouble(), in.nextDouble());
            System.out.println(ball1);
        }
    }
}
