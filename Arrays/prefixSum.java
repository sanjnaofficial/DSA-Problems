package Arrays;

import java.util.Scanner;

public class prefixSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        int[] pSum= new int[n];
        pSum[0]= arr[0];

        for (int i = 1; i < n; i++) {
            pSum[i]= pSum[i-1] + arr[i];
        }

        int[] pWSum = new int[n];
        pWSum[0]=0;
        for (int i = 1; i < pWSum.length; i++) {
            pWSum[i]= pWSum[i-1]+ i*arr[i];
        }

        int start= s.nextInt(), end= s.nextInt();

        System.out.println(getSum(arr, start, end));
        System.out.println(getSum1(pSum, start, end));

        System.out.println(getWsum(arr, pSum,pWSum, start, end));
        
    }

    static int getSum(int[] arr, int s, int e){// naive solution    O(e-s+1)
        int sum=0;
        for(int i=s;i<=e;i++){
            sum+=arr[i];
        }

        return sum;
    }

    static int getSum1(int[] pSum, int s, int e){// O(1)
        if(s==0) return pSum[e];
        
        return pSum[e] - pSum[s-1];
    }

    static int getWsum(int[] arr,int[]pSum,int[] pWSum, int s, int e){// get weighted sum: (1*arr[s] + 2*arr[s+1]+...+(e-s+1)arr[e])
        int sum=0, wsum=0;
        if(s==0) {
            sum= pSum[e];
            wsum=pWSum[e];
        }
        else {
            sum=(pSum[e]-pSum[s-1]);
            wsum=(pWSum[e]-pWSum[s-1]);
        }

        return wsum-(sum*(s-1));
    }
}
