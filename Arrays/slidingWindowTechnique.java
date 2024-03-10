package Arrays;

import java.util.Scanner;

// max sum of k consecutive elements
public class slidingWindowTechnique {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        int k= s.nextInt();//size of consecutive subarray

        System.out.println(findMax(arr, k));
        System.out.println(slw(arr, k));
    }

    static int findMax(int[] arr, int k){// TC:O(n*k)
        int n= arr.length, max=Integer.MIN_VALUE;

        for (int i = 0; i< n-k+1; i++) {//O(n)
            int sum=0;
            for (int j = i; j < (i+k); j++) {// O(k)
                sum+=arr[j];
            }
            max = Math.max(max, sum);
        }

        return max;
    }

    static int slw(int[] arr, int k){//efficient sol    O(n)
        int n= arr.length, sum=0, max=0;

        for (int i = 0; i < k; i++) {
            sum+= arr[i];
        }
        max= sum;
        for (int i = k; i < n; i++) {
            sum+= arr[i]- arr[i-k];
            max= Math.max(max, sum);
        }

        return max;
    }


}
