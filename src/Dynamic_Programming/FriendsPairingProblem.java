package Dynamic_Programming;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsPairingProblem {
    static int[] dp;//global declaration so that it does not need to be called every time
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dp=new int[n+1];// this means dp[i] stores the value of i
        //Arrays.fill(dp,-1);
        //System.out.println(pair(n));
        System.out.println(friend(n));
    }
    public static int friend(int n){
        dp=new int[n+1];
        dp[1]=1;
        if(n>1) dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }
    public static int pair(int n){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=pair(n-1)+(n-1)*pair(n-2);
    }
}
