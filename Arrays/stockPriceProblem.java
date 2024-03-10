package Arrays;

import java.util.Scanner;

public class stockPriceProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }
        int start=0;
        int end = n-1;
        System.out.println(maxprofit(arr,start, end));
        System.out.println(maxProfit2(arr));
        
    }

    static int maxprofit(int[] arr, int start, int end){ // naive solution

        if(end<=start){
            return 0;
        }
        int profit=0;
        
        for (int i = start; i < end; i++) {
            for (int j = i+1; j <=end; j++) {
                if(arr[j]>arr[i]){
                    int currProfit= (arr[j]-arr[i])+ maxprofit(arr, start, i-1)+ maxprofit(arr, j+1, end);
                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;
    }

    static int maxProfit2(int[] arr){
        int profit=0;

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]>arr[i]){
                profit+= (arr[i+1]-arr[i]);
            }
        }
        return profit;
    }
}
