package Arrays;

import java.util.Arrays;
import java.util.Scanner;
// Given an array arr of size n and an integer X. Find if there's a triplet in the array which sums up to the given integer X.
public class TripletSum{
    public static boolean tripletSumFunction(int[] arr, int x){
        int n= arr.length;

        Arrays.sort(arr);

        for(int i=0;i<n-2;i++){
            int sum= x-arr[i];
            int j=i+1, k=n-1;

            while(j<k){
                int sum2=arr[j]+arr[k];
                if(sum2==sum) return true;
                else if(sum2<sum)j++;
                else k--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i <n; i++) {
            arr[i]= s.nextInt();
        }

        int x= s.nextInt();
        System.out.println(tripletSumFunction(arr, x));
    }
}