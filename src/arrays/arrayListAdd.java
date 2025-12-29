package arrays;
import java.util.ArrayList;
public class arrayListAdd {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(list+" "+list.size());
        list.add(5);
        System.out.println(list+" "+list.size());
        list.add(-5);
        System.out.println(list+" "+list.size());
        list.add(15);
        System.out.println(list+" "+list.size());
        list.add(555);
        System.out.println(list+" "+list.size());
        list.add(51);
        System.out.println(list+" "+list.size());
        list.remove(1);
        System.out.println(list+" "+list.size());
    }
}
