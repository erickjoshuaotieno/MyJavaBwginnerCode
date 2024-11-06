import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();


        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner1.nextLine();

        System.out.println("Your name is, "+name.trim().toLowerCase()+" "+ "and you are "+age+" years old");


    }
}
