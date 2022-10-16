package Practice2.task_4;

import java.util.Scanner;

public class ShopTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Shop shop = new Shop(n);
        shop.addComputer(shop.createComputer("i5", 8, 256));
        shop.addComputer(shop.createComputer("3500u", 16, 512));
        shop.addComputer(shop.createComputer("i7", 16, 1000));
        System.out.print(shop.toString());
        //System.out.println(shop.searchComputer("i5", 8, 256));
        //System.out.println(shop.searchComputer("i7", 8, 256));
        shop.removeComputer(shop.searchComputer("3500u", 16, 512));
        System.out.print(shop.toString());
    }
}
