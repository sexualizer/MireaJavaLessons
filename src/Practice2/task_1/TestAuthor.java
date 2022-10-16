package Practice2.task_1;

import Practice2.task_1.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        Author author = new Author(in.nextLine(), in.nextLine(), in.nextLine().charAt(0));
        System.out.println(author);
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        author.setName(in.nextLine());
        System.out.println(author);
    }
}
