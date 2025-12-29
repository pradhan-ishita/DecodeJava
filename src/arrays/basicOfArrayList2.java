package arrays;
import java.util.ArrayList;
public class basicOfArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0, 19);
        arr.add(1, 4);
        arr.add(2, 12);
        arr.add(3, 23);
        arr.add(4, 19);
        arr.add(5, 8);
        System.out.println(arr.size());
        System.out.println(arr);
        arr.set(2, 300);
        System.out.println(arr);
        arr.add(90);
        System.out.println(arr.size());
        System.out.println(arr);
    }
}
