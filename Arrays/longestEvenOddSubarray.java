package Arrays;

import java.util.Scanner;

public class longestEvenOddSubarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }


        System.out.println(longestSubArray(arr));
    }

    static int longestSubArray(int[]arr){// naive method
        int res=1;
        
        for (int i = 0; i < arr.length; i++) {// O(n^2)
            int ans=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j-1]%2==0 && arr[j]%2!=0 || arr[j-1]%2!=0 && arr[j]%2==0) ans++;

                else break;
            }

            res = Math.max(ans, res);
        }

        return res;

        }
    }
