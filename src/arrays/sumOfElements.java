package arrays;

public class sumOfElements {
    public static void main(String[] args) {
        int[] arr = {10,20,30,22,98,45};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
