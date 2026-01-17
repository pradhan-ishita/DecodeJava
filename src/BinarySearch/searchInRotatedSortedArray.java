package BinarySearch;

public class searchInRotatedSortedArray {

    public int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target) return mid;

            else if (arr[mid] <= arr[hi]) {
                // right half is sorted
                if (target > arr[mid] && target <= arr[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
            else {
                // left half is sorted
                if (target >= arr[lo] && target < arr[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        searchInRotatedSortedArray obj = new searchInRotatedSortedArray();
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(obj.search(arr, 0)); // Output: 4
    }
}
