package Practice1;

import java.util.Scanner;

public class task_2 {
    public static void main(String []  args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number of elements: ");
        int n = in.nextInt();
        int max = 0;
        int min = Integer.MAX_VALUE;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
        }
        System.out.println(sum);
        int j = 0;
        sum = 0;
        while(j < n){
            sum += arr[j];
            j++;
        }
        System.out.println(sum);
        int k = 0;
        sum = 0;
        do {
            sum += arr[k];
            k++;
        } while (k < n);
        for (int i = 0; i < n; ++i){
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}