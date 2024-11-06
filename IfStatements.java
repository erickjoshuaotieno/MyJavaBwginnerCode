import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        double temp = scanner.nextDouble();

        if (temp > 30){
            System.out.println("its a hot day");
            System.out.println("drink plenty of water");
        } else if (temp >20 && temp <=30) {
            System.out.println("its a beautiful day");
        }else {
            System.out.println("its a cold day");
        }
    }
}
