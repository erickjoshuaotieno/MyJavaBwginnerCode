import java.awt.*;
import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        int[] numbers= {1,3,4,6,7,144,78};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        String[] fruits={"mango","apple","quava","bananna"};
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        String fnsme ="Erick";
        String lname = "Joshua";
        System.out.println(fnsme +" " + lname);

    }
}
