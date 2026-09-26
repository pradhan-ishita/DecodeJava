package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class countDearrangements {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        dp=new int[n+1];
        //Arrays.fill(dp,-1);
        //System.out.println(dearrangement(n));
        System.out.println(wrongArrangement(n));
    }
    public static int wrongArrangement(int n) {
        dp[1] = 0;
        dp[0] =  1;
        for (int i = 2; i <= n; i++) {
            dp[i]=(i - 1) * (dp[i - 1] + dp[i - 2]);
        }
        return dp[n];
    }

        public static int dearrangement(int n){
        if(n==1) return 0;
        if(n<=2) return n-1;
        if(dp[n]!=-1) return dp[n];
        return (n-1)*(dearrangement(n-1)+dearrangement(n-2));
    }

}
