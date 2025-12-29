package arrays;
public class sortZeroesAndOnes {
    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,1,0,0,1,0};
        int n=arr.length;
        for(int ele:arr) {
            System.out.print(ele + " ");
        }
        System.out.println( );
        int noOfOnes=0,noOfZeroes=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)noOfZeroes++;
            else noOfOnes++;
        }
        for(int i=0;i<noOfZeroes;i++){
            arr[i]=0;
        }
        for(int i=noOfZeroes;i<n;i++){
            arr[i]=1;
        }
        for(int ele:arr) {
            System.out.print(ele + " ");
        }
    }
}
