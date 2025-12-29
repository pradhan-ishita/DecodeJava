package arrays;

public class rollNumber {
    public static void main(String[] args) {
        int[] arr ={10,20,30,22,12,32,99,23,78,56,12,67,45,33,27,78,43,98,45};
        int n=arr.length;
       // System.out.println(n);
        System.out.println("Students with less than 35 marks: ");
        for(int i=0;i<n;i++){
            if(arr[i]<35)
                System.out.println(i +" ");
        }
    }
}
