package Arrays;
import java.util.Scanner;
//program to find the no. in an array which have occurred odd no of times
public class OneOddOccuringNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        
        System.out.println(oddOccurence(arr));
        System.out.println(oddOccurence2(arr));
    }

    public static int oddOccurence(int[] arr){// naive method
        int count=0;
        for(int i=0;i<arr.length;i++){//O(n^2)
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count%2!=0){
                return arr[i];
            }
        }
        return 0;
    }

    public static int oddOccurence2(int[] arr){ //TC: O(n)  auxillary space: O(1)
        int res=0;
        for(int i=0;i<arr.length;i++){
            res= res ^ arr[i];
        }
        return res;
    }
}
