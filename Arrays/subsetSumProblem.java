package Arrays;

import java.util.Scanner;

public class subsetSumProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= s.nextInt();
        }
        int sum = s.nextInt();

        System.out.println(subsetSum(arr, n, sum));
    }

    public static int subsetSum(int[] arr, int n, int sum){
        if(n==0){
            return (sum==0)?1:0;// if sum==0 then return 1 or else return 0
        }
        
        return subsetSum(arr, n-1, sum)+ subsetSum(arr, n-1, sum-arr[n-1]);
    }
}
