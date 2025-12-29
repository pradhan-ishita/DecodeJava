package arrays;
import java.util.Arrays;
public class builtInMethods{
    public static void main(String[] args) {
        int[] arr ={30,10,20,56,89,77};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
