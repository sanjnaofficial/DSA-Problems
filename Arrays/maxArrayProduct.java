package Arrays;
import java.util.Scanner;

public class maxArrayProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        maxArray1(arr);

    }

    static void maxArray1(int [] arr){// naive solution     TC:O(n^2)
        int max=arr[0], prod;
        for (int i = 0; i < arr.length; i++) {
            prod = 1;
            for (int j = i; j < arr.length; j++) {
                prod= prod*arr[j];
                if(prod>max){
                    max= prod;
                }
                
            }
        }

        System.out.println(max);
    }

    static void maxArray2(int[] arr){// efficient solution

        int n= arr.length, ans=1;
        if(n==0){
            ans= -1;
            System.out.println(ans);
            return;
        }
        int maxprod= arr[0],minprod= arr[0];
        ans= arr[0];


        int choice1=1,choice2=1;

        for (int i = 1; i < arr.length; i++) {
            choice1= maxprod*arr[i];
            choice2= minprod*arr[i];

            maxprod= Math.max(arr[i], Math.max(choice1, choice2));
            minprod= Math.min(arr[i],Math.min(choice1, choice2));

            ans= Math.max(ans, maxprod);
        }

        System.out.println(ans);

    }
}
