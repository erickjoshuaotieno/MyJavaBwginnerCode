public class TypeConversion {
    public static void main(String[] args) {
        String number = "20";
        int y = Integer.parseInt(number) + 10;
        System.out.println(y);

        String one = "44.23";
        double result = Double.parseDouble(one) + 4.84;
        System.out.println(result);
    }
}
