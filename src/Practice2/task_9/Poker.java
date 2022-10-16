package Practice2.task_9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int n = in.nextInt();
        String[] a = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        ArrayList<String> cards = new ArrayList<>();
        for (int i = 0; i < a.length; ++i){
            cards.add(a[i] + "D");
            cards.add(a[i] + "H");
            cards.add(a[i] + "C");
            cards.add(a[i] + "S");
        }
        //System.out.println(cards);
        //System.out.println(cards.size());
        for (int j = 0; j < n; ++j){
            System.out.print("Player " + (j + 1) + ": ");
            for (int k = 0; k < 5; ++k){
                int ind = random.nextInt(cards.size());
                System.out.print(cards.get(ind) + " ");
                cards.remove(ind);
            }
            System.out.println();
        }
        System.out.println(cards.size() + " cards left");
    }
}
