package Arrays;

import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= s.nextInt();
        }

        System.out.println("Index of the second largest element: "+ secondLargestElement(arr));
        System.out.println("Index of the second largest element: "+ secondLargestElement2(arr));
    
    }

    static int secondLargestElement(int[] arr){// naive approach    TC: O(n^2)
        int index= getlargest(arr);
        int res=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[index]){
                if(res==-1){
                    res=i;
                }
                else if(arr[i]>arr[res]){
                    res=i;
                }
            }
        }


        return res;
    }

    static int getlargest(int[] arr){
        int res=0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[res]){
                res=i;
            }
        }

        return res;
    }

    static int secondLargestElement2(int[] arr){//TC: O(n)  efficient approach
        int res=-1, largestIndex=0;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[largestIndex]){
                res=largestIndex;
                largestIndex=i;
            }

            else if(arr[i]!=arr[largestIndex]){
                if(res==-1 || arr[i]>arr[res]){
                    res=i;
                }
            }
            
        }


        return res;
    }
}
