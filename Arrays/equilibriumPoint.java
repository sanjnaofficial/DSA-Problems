package Arrays;

import java.util.Scanner;

public class equilibriumPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        System.out.println(equilibrium1(arr));
        System.out.println(equilibrium2(arr));
        System.out.println(equilibrium3(arr));
    }

    static boolean equilibrium1(int[]arr){// naive solution TC:O(n^2)
        int ls=0, rs=0, n= arr.length;
        for (int i = 0; i < n; i++) {
            ls=0; rs=0;
            for (int j = i+1; j < n; j++) {// right sum
                rs+=arr[j];
            }

            for (int j = i-1; j>=0; j--) {// left sum
                ls+=arr[j];
            }

            if(ls==rs) return true;
        }

        return false;

    }

    static boolean equilibrium2(int[] arr){// efficient sol TC:O(n) Aux Space:O(n)
        int n= arr.length;
        int[] pSum= new int[n];// prefix sum
        int[] sSum= new int[n];// suffix sum

        pSum[0]=arr[0];
        for (int i = 1; i < n; i++) {
            pSum[i]=pSum[i-1]+ arr[i];
        }

        sSum[n-1]=arr[n-1];
        for (int i = n-2; i>=0; i--) {
            sSum[i]=sSum[i+1]+ arr[i];
        }

        for (int i = 1; i < n-1; i++) {
            if(pSum[i-1]==sSum[i+1]) return true;
        }

        return false;
    }

    static boolean equilibrium3(int[]arr){// most efficient sol TC:O(n) Aux Space:O(1)
        int n= arr.length;
        int rSum=0, lSum=0;// right_sum and left_sum resp.
        for (int i = 0; i < n; i++) {
            rSum+=arr[i];// calculating total sum of array
        }

        for (int i = 0; i < n; i++) {
            rSum-=arr[i];// right sum for ith index

            if(lSum==rSum) return true;

            lSum+=arr[i];
        }

        return true;
    }
}
