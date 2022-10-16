package Practice1;

import java.util.Scanner;

public class task_4 {
    public static void main(String []  args) {
        Scanner in = new Scanner(System.in);
        float sum = 0f;
        for (float i = 1; i <= 10; i++){
            System.out.println(1/i);
            sum += 1/i;
        }
        System.out.println(String.format("%.2f", sum));
    }
}
