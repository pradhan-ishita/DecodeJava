package basicSorting;

public class checkIfArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[]arr={1,2,6,4,5,9};
        int n=arr.length;
        boolean flag=true;//true means sorted
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;//false->unsorted
                break;
            }
        }
        if(flag==true) System.out.println("Sorted");
        else System.out.println(("Unsorted"));
    }
}
