package Practice1;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long res = 1;
        for (int i = 1; i <= n; ++i){
            res *= i;
        }
        System.out.println("!" + n + " = " + res);
    }
}
