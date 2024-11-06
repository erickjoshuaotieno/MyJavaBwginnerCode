import java.util.Scanner;

public class WhileLoopsForRepetition {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input="";
        while (!input.equals("quit")){
            System.out.println("Input: ");
            input=scanner.nextLine().toLowerCase();
            System.out.println(input);
        }
    }
}
