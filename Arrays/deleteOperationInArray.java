package Arrays;
import java.util.Scanner;

public class deleteOperationInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= s.nextInt();
        }

        
        System.out.println("Enter element to delete");
        int x= s.nextInt();
        
        System.out.println( delete(arr,n, x));
    }
    static int delete(int[] arr, int n, int x){//TC: O(n)
       int i;
       for(i=0;i<n;i++){
        if(arr[i]==x)
        break;
       }

       if(i==n)// we didn't get the element
       return n;

       for(int j=i;j<n-1;j++){
        arr[j]=arr[j+1];
       }
        return(n-1);
    }
}
