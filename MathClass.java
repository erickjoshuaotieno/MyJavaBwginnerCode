public class MathClass {
    public static void main(String[] args) {
        int result = Math.round(2.6F);
        System.out.println(result);
        int number = (int)Math.ceil(3.2);
        System.out.println(number);
        int x = (int)Math.floor(45.2);
        int v = Math.max(20, 40);
        System.out.println(v);
        int c = Math.min(-3, 1);
        System.out.println(c);
        int rand = (int)(Math.random() * 100);
        System.out.println(rand);

    }
}
