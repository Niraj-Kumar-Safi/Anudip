
import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args) {
        int c=0;
        int[] array = {12, 35, 1, 10, 34, 1};

        Arrays.sort(array);
        c=array.length;

        System.out.println("Second largest number :" +array[c-2]);
    }
}
        

