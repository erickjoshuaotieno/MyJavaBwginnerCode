import java.text.NumberFormat;

public class NumberFormatting {
    public static void main(String[] args) {
        NumberFormat curreny = NumberFormat.getCurrencyInstance();
        String result = curreny.format(12345.56);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String per = percent.format(0.25);
        System.out.println(per);

        //alternatively, the above code can be written as (using different variable names)
        String result1 = NumberFormat.getCurrencyInstance().format(2769.56);
        System.out.println(result1);

        String per1 = NumberFormat.getPercentInstance().format(0.34);
        System.out.println(per1);

    }
}
