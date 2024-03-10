package Arrays;
import java.util.Scanner;

public class moveZeroesToEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
       // moveZeroes(arr);
        moveZeroes2(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void moveZeroes(int[] arr){// naive method
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                for (int j = i+1; j < arr.length; j++) {
                    if(arr[j]!=0){
                        swap(arr,i, j);
                        break;
                    }
                }
            }
        }

     
    }

    static void moveZeroes2(int[] arr){//efficient method   TC: O(n)
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr, count, i);
                count++;
            }
        }

    }

    static void swap(int[] arr, int x, int y){
        int temp=arr[x];
        arr[x]= arr[y];
        arr[y]= temp;
    }
}
