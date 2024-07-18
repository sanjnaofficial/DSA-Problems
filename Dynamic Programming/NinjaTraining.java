import java.util.Arrays;
public class NinjaTraining {

    
}

class Solution {
    //recursive solution with memoization
    public static int f(int day, int last, int[][]points, int[][] dp){
        if(day==0){
            int maxi=0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    maxi=Math.max(maxi,points[0][i]);
                }
            }
            return maxi;
        }

        if(dp[day][last]!=-1) return dp[day][last];

        int maxi=0;
        for(int i=0;i<3;i++){
            if(i!=last){
                int point=points[day][i]+f(day-1,i,points,dp);
                maxi=Math.max(maxi,point);
            }
        }
        dp[day][last]=maxi;
        return dp[day][last];
    }
    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        int[][] dp= new int[n][4];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }

        return f(n-1,3,points, dp);
    }

}