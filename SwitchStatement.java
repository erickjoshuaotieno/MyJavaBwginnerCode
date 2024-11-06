import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter role: ");
        String role = scanner.nextLine();
        switch (role) {
            case "admin":
                System.out.println("you are an admin");
                break;
            case "moderartor":
                System.out.println("you are a moderator");
                break;
            default:
                System.out.println("you are a guest");
        }
    }
}
