package Practice2.task_5;

import java.util.ArrayList;
import java.util.Scanner;

public class DogTester {
    static Scanner in = new Scanner(System.in);

    public static Dog addDog() {
        System.out.print("Enter a name: ");
        String name = in.next();
        System.out.print("Enter an age: ");
        int age = in.nextInt();
        return new Dog(name, age);
    }

    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();
        System.out.print("Enter dog's array capacity: ");
        int n = in.nextInt();
        for (int i = 0; i < n; ++i){
            dogs.add(addDog());
        }
        while(true){
            System.out.println("1. Add dog");
            System.out.println("2. Show dog's array");
            System.out.println("3. End of program");
            int task = in.nextInt();
            if (task == 1){
                dogs.add(addDog());
            }
            else if (task == 2){
                System.out.println(dogs);
            }
            else if (task == 3){
                System.out.println(dogs);
                return;
            }
        }

    }
}
