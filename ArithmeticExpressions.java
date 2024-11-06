public class ArithmeticExpressions {
    public static void main(String[] args) {
        // they include +/-*%
        double result = (double) 10 / 3;
        System.out.println(result);

        // there also exists the increment operator ++ (x++ or ++x)
        int x = 2;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        double v =1;
        double z = ++v;
        System.out.println(v);
        System.out.println(z);

        float d = 7F;
        d +=3;
        System.out.println(d);
    }
}
