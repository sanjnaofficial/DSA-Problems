package Arrays;

import java.util.*;
public class removeDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        System.out.println("After removing duplicates from sorted array:");
        removeDuplicates2(arr);
        // removeDuplicates(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    static int[] removeDuplicates(int[] arr){// naive method TC: O(n) and auxilary space: O(n)
        int n= arr.length;
        int[] temp = new int[n];
        int c=1;
        temp[0]= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i-1]!=arr[i]){// OR if(arr[c-1]!=arr[i])
                temp[c]= arr[i];
                c++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i]= temp[i];
        }

        return arr;
    }

    static int[] removeDuplicates2(int[] arr){//TC: O(n) and auxilary space: O(1)
        int res=1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[res-1]!=arr[i]){
                arr[res]= arr[i];
                res++;
            }
        }

        return arr;
    }
}
