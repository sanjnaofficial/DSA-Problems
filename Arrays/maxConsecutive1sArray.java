package Arrays;
import java.util.Scanner;

    public class maxConsecutive1sArray{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i]= s.nextInt();
    }

    System.out.println(countConsecutiveOnes(arr));
    System.out.println(maxConsecutiveOnes(arr));

    }

    static int countConsecutiveOnes(int[] arr){// naive soln TC: O(n)
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            int curr = 0;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]==1) curr++;
                else break;
            }
            res = Math.max(res, curr); 
        }

        return res;
    }

    static int maxConsecutiveOnes(int[] arr){// TC: O(n)
        int res = 0, curr=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                curr=0;
            }
            else{
                curr++;
                res = Math.max(res, curr);
            }
        }

        return res;
    }
}