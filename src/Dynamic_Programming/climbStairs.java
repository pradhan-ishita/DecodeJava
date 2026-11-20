package Dynamic_Programming;
import java.util.Scanner;
public class climbStairs {
    static int[] dp;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dp=new int[n+1];
        System.out.println(stairs(n));
    }
    public static int stairs(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
