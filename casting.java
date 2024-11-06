public class casting {
    public static void main(String[] args) {
        // there are two types, Implicit or automatic casting byte > short > int > long > float > double
        short x =2;
        int y =5 + x;
        System.out.println(y);
        // explicit casting is done manually
        double v = 20.99;
        int z = (int)v + 61;
        System.out.println(z);

    }
}
