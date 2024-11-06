import java.awt.*;

public class DifferencesBtwPrimitiveAndReference_Types {
    public static void main(String[] args){
        //primitive types are independent and are stored in different memory locations
        //reference types refer to the same memory location and are dependent
        //primitive types
        byte a=2;
        byte b=a;
        a=6;
        System.out.println(b);
        //reference types
        Point point1= new Point(3,4);
        Point point2= point1;
        point1.x=6;
        System.out.println(point2);
    }
}
