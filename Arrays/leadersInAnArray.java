package Arrays;
import java.util.Scanner;
// leader in the element is the one which is greater than all the lements on it's right
public class leadersInAnArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        //leaders(arr);
        leaders2(arr);
        
    }

    static void leaders(int[] arr){// naive solution    TC: O(n^2)
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            flag = true;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<=arr[j]){
                    flag=false;
                    break;
                }
                
            }
            if(flag==true){
                System.out.println(arr[i]);
            }
        }
    }

    static void leaders2(int[] arr){// efficient solution O(n)
        //will print the leaders in right to left order
        // we can make it print from left to right by storing the ans in an arr and then printing them in reverse order
        int n = arr.length;
        int curr_leader = arr[n-1];
        System.out.println(curr_leader);

        for (int i = n-2; i >=0; i--) {
            if(arr[i]> curr_leader){
                curr_leader = arr[i];
                System.out.println(curr_leader);
            }
            
        }
    }
}
