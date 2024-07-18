import java.util.Scanner;

// fibonacci using dynamic programming
// this problem is similar to climb stairs problem

public class fibonacci{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n+1];

        System.out.println(fibo(n, dp));
        System.out.println(fibo2(n));
    }

    public static int fibo(int n, int[] dp) {// -> memoization  Tc: O(n)    SC:O(n)+ O(n)
        if(n==0 || n==1){
            return n;
        }
        else if(dp[n]!=0){
            return dp[n];
        }
        else{
            dp[n]= fibo(n-1, dp) + fibo(n-2, dp);
        }

        return dp[n];
    }

    public static int fibo2(int n) {// -> tabulation with space optimization  Tc: O(n)    SC:O(1)
        if(n==0 || n==1){
            return n;
        }

        int curr=0, prev=1, prev2=0;

        for(int i=2;i<=n;i++){
            curr = prev + prev2;
            prev2 = prev;
            prev = curr;
        }

        return curr;
       
    }
}