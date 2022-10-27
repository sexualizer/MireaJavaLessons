package Practice4.task_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Shop{
    private Scanner in;
    private HashMap<Product, Integer> basket;
    private boolean isIn = false;
    private String login;
    private String pass;
    private int sum = 0;
    private int count = 0;

    public Shop(){
        in = new Scanner(System.in);
        System.out.println("Authentication: ");
        System.out.print("Login: ");
        login = in.nextLine();
        System.out.print("Pass: ");
        pass = in.nextLine();
        isIn = true;
        basket = new HashMap<>();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isIn() {
        return isIn;
    }

    public void showCatalog(){
        int task = -1;
        while (true) {
            System.out.println("0. End");
            System.out.println("1. Food");
            System.out.println("2. Clothes");
            task = in.nextInt();
            if (task == 0) break;
            if (!isIn) System.out.println("You're not logged in!");
            else {
                System.out.println("0. Show Catalogs");
                if (task == 1) {
                    int c = 1;
                    for (Product p : Food.values()) {
                        System.out.println(c + ". " + p + " " + p.getPrice() + " rub");
                        c++;
                    }
                    int buy = -1;
                    while (true){
                        buy = in.nextInt();
                        if (buy == 0) break;
                        System.out.print("Enter an amount: ");
                        int amount = in.nextInt();
                        for (Product p : Food.values()){
                            if (buy == p.getNum()){
                                if (!basket.containsKey(p)) basket.put(p, amount);
                                else basket.replace(p, basket.get(p), amount);
                            }
                        }
                    }

                } else if (task == 2) {
                    for (Product p : Clothes.values()) {
                        System.out.println(p.getNum() + ". " + p + " " + p.getPrice() + " rub");
                    }
                    int buy = -1;
                    while (true){
                        buy = in.nextInt();
                        if (buy == 0) break;
                        System.out.print("Enter an amount: ");
                        int amount = in.nextInt();
                        for (Product p : Clothes.values()){
                            if (buy == p.getNum()){
                                if (!basket.containsKey(p)) basket.put(p, amount);
                                else basket.replace(p, basket.get(p), amount);
                            }
                        }
                    }
                }
            }
        }
    }
    public void showBasket(){
        for (Map.Entry<Product, Integer> entry : basket.entrySet()){
            System.out.println((count + 1) + ". " + entry.getKey() + " " + entry.getValue());
            count++;
            sum += entry.getValue() * entry.getKey().getPrice();
        }
        System.out.println("You've bought " + count + " products with average sum of: " + sum);
    }


}
