package Arrays;
import java.util.*;

public class sortedOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        System.out.println(checksorted(arr));
    }

    static boolean checksorted(int[] arr){// TC: O(n)
        
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]<arr[i]){
                return false;
            }
        }
        return true;
    }
}
