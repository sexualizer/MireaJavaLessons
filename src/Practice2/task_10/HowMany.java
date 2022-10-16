package Practice2.task_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while(in.hasNext()){
            count++;
            in.next();
        }
        System.out.println(count);
    }
}
