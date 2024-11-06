import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3},{6,19,44,10}};
        numbers [1][3] = 17;
        System.out.println(Arrays.deepToString(numbers));
    }
}
