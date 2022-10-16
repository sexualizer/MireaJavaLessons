package Practice1;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; ++i){
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("mid = " + sum / n);
    }
}
