package Arrays;
import java.util.Scanner;

public class leftRotateAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= s.nextInt();
        }

        rotateByOne(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void rotateByOne(int[] arr){
        int first = arr[0];

        for (int i = 1; i < arr.length; i++) {// TC: O(n)
            arr[i-1]=arr[i];
        }

        arr[arr.length-1]= first;
    }
}
