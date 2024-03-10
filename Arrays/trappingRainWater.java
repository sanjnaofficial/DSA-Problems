package Arrays;

import java.util.Scanner;
public class trappingRainWater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        System.out.println(trappingRainWater(arr));

        System.out.println(getrainWater(arr));

    }

    static int trappingRainWater(int[] arr){// naive O(n^2)
        int res=0;

        for (int i = 1; i < arr.length-1; i++) {
            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                rmax = Math.max(rmax, arr[j]);
            }

            res = res+ (Math.min(lmax,rmax) - arr[i]);
        }

        return res;

    }

    static int getrainWater(int[] arr){// O(n) time
        int res=0, n= arr.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        lmax[0]= arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i]= Math.max(lmax[i-1], arr[i]);
        }

        rmax[n-1]= arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            rmax[i]= Math.max(rmax[i+1], arr[i]);
        }

        for (int i = 1; i < n-1; i++) {
            res = res + Math.min(rmax[i], lmax[i]) - arr[i];
        }

        return res;

    }
}
