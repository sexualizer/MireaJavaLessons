package Practice2.task_3;

import java.util.ArrayList;

public class Tester {
    private static ArrayList<Circle> circles = new ArrayList<>();
    private static int count = circles.size();

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(1 , 2);
        circles.add(c1);
        circles.add(c2);
        System.out.print(circles);
        System.out.println(count);
    }
}
