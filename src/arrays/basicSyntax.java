package arrays;

public class basicSyntax {
    public static void main(String[]args){
        int x=5;
        int[] arr=new int[5];
        //initialising individual elements
        arr[0]=8;
        arr[1]=18;
        arr[2]=9;
        arr[3]=34;
        arr[4]=81;
        //output of array elements
        System.out.println(arr[0]+" ");
        arr[0]=99;
        arr[0]+=10;
        System.out.println(arr[0]+ " ");
    }
}
