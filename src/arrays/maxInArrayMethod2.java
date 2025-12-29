package arrays;

public class maxInArrayMethod2 {
    public static void main(String[] args){
        int[] arr ={-13,-8,-234,-67,-89};
        int n=arr.length;
        int  mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            //if(arr[i]>mx) mx=arr[i];
            mx=Math.max(mx,arr[i]);
        }
        System.out.println(mx);
    }
}
