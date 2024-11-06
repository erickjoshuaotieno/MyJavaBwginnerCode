import java.text.NumberFormat;
import java.util.Scanner;

public class mortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        Scanner scanner1=new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        double rate = scanner1.nextDouble();

        Scanner scanner2=new Scanner(System.in);
        System.out.print("Period (years): ");
        double years = scanner2.nextDouble();

        rate= (rate/12)/100;
        years =years*12;

        double pow = Math.pow((1+rate),years);
        double numerator = pow*rate;
        double denominator = pow-1;
        double result = principal*(numerator/denominator);
        String Mortgage = NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage: "+Mortgage);

    }
}
