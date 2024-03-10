package Arrays;
import java.util.Scanner;

public class largestElementInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= s.nextInt();
        }

        System.out.println(largest(arr));
    }

    static int largest(int[] arr){//O(n)
        int largest=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(largest<arr[i]){
                largest=arr[i];
            }
        }

        return largest;
    }
}
