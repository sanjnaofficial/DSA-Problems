package Arrays;

import java.util.Scanner;

public class maximumSumSubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        System.out.println(maxSumSubArray(arr));
        System.out.println( maxSumSubArray2(arr));
    }

    static int maxSumSubArray(int[] arr){// TC: O(n^2)
        int n= arr.length;

        int res=arr[0];

        for (int i = 0; i < arr.length; i++) {
            int curr=0;
            for (int j = i; j < arr.length; j++) {
                curr+=arr[j];
                res = Math.max(res,curr);
            }
        }

        return res;
    }

    // maxEnding[i]= max(maxEnding[i-1]+arr[i], arr[i]);
    static int maxSumSubArray2(int [] arr){// TC:O(n) //kadane's algorithm
        int maxEnding= arr[0], max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEnding= Math.max(maxEnding+arr[i], arr[i]);//1. extend the prev maxEnding array or start a new subarray with this element
            max= Math.max(max, maxEnding );
        }

        return max;
    }
  
}
