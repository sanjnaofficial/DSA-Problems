package Arrays;

import java.util.Scanner;

public class subarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        int k= s.nextInt();//sum of consecutive subarray

        System.out.println(isSum(arr,k));
    }

    static boolean isSum(int[] arr, int k){// O(n)  efficient sol   sliding window
        int n= arr.length, i=0, j=0, sum=0;

        for (i = 0; i < n; i++) {
            sum+=arr[i];
            
            while(sum>k){
                sum-=arr[j];
                j++;
            }

            if(sum==k) return true;
        }

        return false;
    }

    static boolean isSubArr(int[]arr, int k){// naive sol   TC: O(n^2)
        int n= arr.length;

        for (int i = 0; i < n; i++) {// starting with i and ending with j
            int curr=0;
            for (int j = i; j < n; j++) {
                curr+=arr[j];
                if(curr==k) return true;
            }
            
        }
        return false;
    }
}
