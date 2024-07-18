public class NinjaTraining {
    
}

class Solution {
    //recursive solution
    public static int f(int day, int last, int[][]points){
        if(day==0){
            int maxi=0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    maxi=Math.max(maxi,points[0][i]);
                }
            }
            return maxi;
        }
        int maxi=0;
        for(int i=0;i<3;i++){
            if(i!=last){
                int point=points[day][i]+f(day-1,i,points);
                maxi=Math.max(maxi,point);
            }
        }
        return maxi;
    }
    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        return f(n-1,3,points);
    }

}
