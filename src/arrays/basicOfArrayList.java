package arrays;
import java.util.ArrayList;
public class basicOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(6);
        arr.add(0,19);
        arr.add(1,4);
        arr.add(2,12);
        arr.add(3,23);
        arr.add(4,19);
        arr.add(5,8);
        //print the elements in arrayList will give output with []
        System.out.println(arr);
        //print the elements in arrayList will give output without []
       for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
       }
        System.out.println();
       //to update the value of a particular index in the arrayList
        arr.set(2,300);
        System.out.println(arr);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
