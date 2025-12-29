package arrays;
import java.util.Arrays;
public class forEachLoop {
    public static void main(String[] args){
        int[] arr ={30,23,12,78,56,45};
        //for each loop
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
