package Arrays;

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        reverse(arr);
        System.out.println("array after reversing");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    static int[] reverse(int[] arr){
        int low=0, high=arr.length-1, temp;

        while(low<high){// loop eill run n/2 times  TC: O(n)
            temp= arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

        return arr;
    }
}
