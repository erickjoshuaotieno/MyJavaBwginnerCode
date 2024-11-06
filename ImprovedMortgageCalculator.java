import java.text.NumberFormat;
import java.util.Scanner;

public class ImprovedMortgageCalculator {
    public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);
            double principal;

            while (true){
            System.out.print("Principal ($1K-$1M): ");
            principal = scanner.nextDouble();
            if (principal<1000 && principal>1000000)
                break;
                System.out.println("Enter a value between 1000 and 1000000");

            }

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
