package arrays;

public class productOfElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,56};
        int sum=1;
        for(int i=0;i<arr.length;i++){
            sum*=arr[i];
        }
        System.out.println(sum);
    }
}
