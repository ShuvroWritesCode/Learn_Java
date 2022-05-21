import java.util.Arrays;

public class main {
    public static void main(String[] args){

        int[] num1 = new int[3];
        System.out.println(num1[0]); //if not declared, the index is initialised with 0 for Byte/short/int/long type array.
        boolean[] num2 = new boolean[3];
        System.out.println(num2[0]); //if not declared, the index is initialised with false for boolean array.
        double[] num3 = new double[3];
        System.out.println(num3[0]); //if not declared, the index is initialised with 0.0 for float/double array.

        int[] numbers = {5, 4, 3, 2, 1};
        int[] num = new int[5];
        num[0] = 5;
        num[1] = 4;
        num[2] = 3;
        num[3] = 2;
        num[4] = 1;

        //Array length
        System.out.println("Length of the array is: " + num.length);

        //Array sort
        System.out.println("Before sorting: " + num[0]);
        Arrays.sort(num);
        System.out.println("After sorting: " + num[0]);
    }
}