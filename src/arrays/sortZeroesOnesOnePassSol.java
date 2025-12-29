package arrays;
public class sortZeroesOnesOnePassSol {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1};
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0) i++;
            if (arr[j] == 1) j--;
            if(i>j) break;//need to check if i went pass j inside the loop otherwise it will unnecessarily swap extra
            if (arr[i] == 1 && arr[j] == 0) {
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;

            }
        }
        for(int ele:arr) {
            System.out.print(ele + " ");
        }
    }
}


