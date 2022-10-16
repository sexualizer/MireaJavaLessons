package Practice2.task_8;

import java.util.ArrayList;
import java.util.Scanner;

public class StringElementChanger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> list = new ArrayList<>(n);
        for (int i = 0; i < n; ++i){
            String line = in.next();
            list.add(line);
        }
        System.out.println(list);
        for (int i = 0; i < n - 1; ++i){
            list.add(i, list.remove(n - 1));
        }
        System.out.println(list);
    }
}
