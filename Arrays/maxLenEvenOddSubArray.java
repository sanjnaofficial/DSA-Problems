package Arrays;

import java.util.Scanner;

public class maxLenEvenOddSubArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        System.out.println(maxEvenOddSubArr(arr));
        System.out.println(maxEvenOddSubArr2(arr));
    }

    static int maxEvenOddSubArr(int[] arr){// naive solution O(n^2)
        int res=1, n= arr.length;
        for(int i=0;i<n;i++){
            int curr=1;
            for(int j=i+1;j<n;j++){
                if((arr[j]%2==0 && arr[j-1]%2!=0) || (arr[j]%2!=0 && arr[j-1]%2==0)) curr++;
                else break;
            }
            res = Math.max(res,curr);
        }

        return res;
    }

    static int maxEvenOddSubArr2(int[] arr){// optimized sol: O(n)
        int res=1, curr=1;

        for(int i=1;i<arr.length;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0)|| (arr[i]%2!=0 && arr[i-1]%2==0)){
                curr++;
                res = Math.max(res,curr);
            }
            else curr=1;
        }
        return res;
    }
}
