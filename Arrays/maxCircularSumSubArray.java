package Arrays;
import java.util.Scanner;
public class maxCircularSumSubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        System.out.println(maxCircularSumSubArray1(arr));
        System.out.println();
        System.out.println(maxCircularSumSubArray2(arr));
    }

    static int maxCircularSumSubArray1(int[] arr){// Naive solution TC: O(n^2)
        int res= arr[0];
        int n= arr.length;
        for(int i=0;i<n;i++){
            int curr_max= arr[i];
            int curr_sum=arr[i];
            for (int j = 1; j < n; j++) {
                int index=(i+j)%n;
                curr_sum += arr[index];
                curr_max= Math.max(curr_max,curr_sum);
            }
            res = Math.max(res,curr_max);
        }

        return res;
    }

    static int maxCircularSumSubArray2(int[] arr){// optimised solution TC:O(n)
        int max_normal= maxNormalSubArraySum(arr);

        if(max_normal<0) return max_normal;// if all the elements are -ve then return max_normal


        // max_circular subarray sum= overall array sum - minsubarraySum    or  overall array sum + (maxSubarray of inverted array)
        int arr_sum=0;
        for(int i=0;i<arr.length;i++){// calculating whole array sum
            arr_sum+= arr[i]; 
            arr[i]= -arr[i];// inverting the array
        }

        int max_circular= maxNormalSubArraySum(arr) + arr_sum;

        return Math.max(max_circular,max_normal);
    }

    static int maxNormalSubArraySum(int[]arr){// kadane's algo to find max of normal subarray
        int maxEnding=arr[0], max=arr[0], n= arr.length;

        for(int i=1;i<n;i++){
            maxEnding= Math.max(maxEnding+arr[i], arr[i]);
            max= Math.max(maxEnding,max);
        }

        return max;
    }
}
