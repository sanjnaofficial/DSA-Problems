package Arrays;

import java.util.Scanner;

public class majorityElement{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        System.out.println(arr[majorityElement1(arr)]);
        System.out.println(arr[majorityElement2(arr)]);
    }

    static int majorityElement1(int[] arr){// naive sol TC: O(n^2)
        int n= arr.length;

        for (int i = 0; i < n; i++) {
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]) count++;
            }
            if(count>(n/2)) return i;
        }
        return -1; 
    }

    static int majorityElement2(int[] arr){// Moore's voting algorithm  efficient sol TC:O(n) Aux Space:O(1)
        int count=1, res=0, n= arr.length;
        for (int i = 1; i < n; i++) {
            if(arr[res]==arr[i]) count++;
            else count--;

            if(count==0){
                res=i; count=1;
            }
        }

        count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[res]) count++;
        }
        if(count<=n/2) return -1;
        return res;
    }
}
