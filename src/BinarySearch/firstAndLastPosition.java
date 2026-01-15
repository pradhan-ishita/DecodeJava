package BinarySearch;

import java.util.Arrays;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int target=40;
        int[]ans={-1,-1};
        int[] arr={10,20,30,40,40 ,40,50,78};
        int n=arr.length;
        //first check if element is present
        int lo=0,hi=n-1;
        boolean flag=false;//false means not present
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }
            else if(arr[mid]>target)hi=mid-1;
            else if(arr[mid]<target)lo=mid+1;
        }
//        if(flag==false)
//            return ans;
        if (!flag) {
            System.out.println(Arrays.toString(ans));
            return;
        }
        //now find a lower bound
        lo=0;hi=n-1;
        int lb=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=target){
                lb=Math.min(lb,mid);
                hi=mid-1;
            }
            else lo=mid+1;

        }
        ans[0]=lb;
        //now find upper bound
        lo=0;hi=n-1;
        int ub=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>target){
                ub=Math.min(ub,mid);
                hi=mid-1;
            }
            else lo=mid+1;

        }
        ans[1]=ub-1;
        System.out.println(Arrays.toString(ans));
    }
}