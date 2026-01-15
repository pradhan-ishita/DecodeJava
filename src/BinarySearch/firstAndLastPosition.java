package BinarySearch;

public class firstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {10,10,20,20,20,20,20, 30,30,30,40, 40};
        int x = 30;
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int lb = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= x) {
                lb = Math.min(lb, mid);
                hi = mid - 1;
                ub = mid;
                hi = mid - 1;

            } else lo = mid + 1;
        }
        System.out.println(ub);
    }

            } else lo = mid + 1;
        }
        System.out.println(lb);
    }
}
