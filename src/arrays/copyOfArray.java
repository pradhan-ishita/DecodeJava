package arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int[] arr ={30,22,90,34,1,2,56,3};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //int[] nums =arr;//shallow copy
        //nums[0]=70;
       // System.out.println(arr[0]);
        //deep copy
//        int[] brr= Arrays.copyOf(arr,arr.length);//by builtin method
//        brr[0]=70;//by builtin method
//        System.out.println(arr[0]);//by builtin method
        int[] crr= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            crr[i]=arr[i];
        }
        crr[0]=100;
        System.out.println(arr[0]);
        }
    }

