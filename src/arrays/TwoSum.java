package arrays;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+" "+arr[j]);
                  //  break;//to print only one pair
                }
            }


        }
    }
}
