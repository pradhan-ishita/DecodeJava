package BinarySearch;

import java.sql.SQLOutput;

public class capacityToShipPackages {
    public boolean isPossible(int c,int[] arr,int d){
        int n=arr.length;
        int load=0;
        int days=1;
        for(int i=0;i<n;i++){
            if(load+arr[i]<=c) load+=arr[i];
            else{
                load=arr[i];
                days++;
            }
        }
        if(days>d)return false;
        else return true;
    }
    public int shipWithinDays(int[] arr, int d) {
        int n=arr.length;
        int sum=0,mx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,arr[i]);
            sum+=arr[i];
        }
        int lo=mx,hi=sum,minC=sum;
        while(lo<=hi){//TC=O(n*(sum-mx))
            int mid=lo+(hi-lo)/2;
            if(isPossible(mid,arr,d)==true){
                minC=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        return minC;
    }

    public static void main(String[] args) {
        capacityToShipPackages obj = new capacityToShipPackages();

        int[] arr = {3, 2, 2, 4, 1, 4};
        int days = 3;

        int result = obj.shipWithinDays(arr, days);
        System.out.println(result); // Output: 6
    }
}
