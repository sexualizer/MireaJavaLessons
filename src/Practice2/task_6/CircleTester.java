package Practice2.task_6;

import java.util.Scanner;

public class CircleTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r1 = in.nextInt();
        Circle c1 = new Circle(r1);
        int r2 = in.nextInt();
        Circle c2 = new Circle(r2);
        System.out.println(c1);
        System.out.println(c2);
        c1.compareCircles(c2);
    }
}
