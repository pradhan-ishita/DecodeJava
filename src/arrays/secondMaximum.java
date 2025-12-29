package arrays;

public class secondMaximum {
    public static void main(String[] args) {
        int[] arr={-10,-56,-34,2,-78,54,44};
        int n=arr.length;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
        }
        int smx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>smx && arr[i]!=mx)smx=arr[i];
        //if(arr[i]!=mx)
           // smx=Math.max(smx,arr[i]);
        }
        System.out.println(mx);
        System.out.println(smx);
    }
}
