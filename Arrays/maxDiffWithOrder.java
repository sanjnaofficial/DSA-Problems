package Arrays;
import java.util.Scanner;
// max value of arr[j]- arr[i] such that j>i

public class maxDiffWithOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        //maxDiff(arr);
        maxDiff2(arr);

    }

    static void maxDiff(int[] arr){// naive solution TC: O(n^2)
        int n = arr.length;
        int max= arr[1]-arr[0],diff=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                diff= arr[j]-arr[i];
                if(diff>max){
                    max = diff;
                }
            }
        }
        System.out.println(max);
    }

    static void maxDiff2(int[] arr){//efficient sol TC: O(n)
        int min= arr[0], max = arr[1]-arr[0], diff=0;
        for (int i = 1; i < arr.length; i++) {
            diff = arr[i]-min;
            if(diff >max){
                max = diff;
            }

            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println(max);

    }
}
