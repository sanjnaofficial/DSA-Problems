package Arrays;
import java.util.Scanner;
// frequency of every element in sorted array

public class frequencyInASortedArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        frequency(arr);

    }

    static void frequency(int[]arr){// O(n) as i is being incremented
        int n = arr.length, count=1;
        int i=1;

        while(i<n){
            while (i<n && arr[i]==arr[i-1]) {
                count++;
                i++;                
            }
            System.out.println(arr[i-1]+" freq is "+ count);
            
            i++;
            count=1;
        }

        if (n==1 || arr[n-1]!=arr[n-2]) {
            System.out.println(arr[n-1]+" freq is "+ 1);
        }

        
    }
}
