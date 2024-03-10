package Arrays;

import java.util.Scanner;

public class rotateAnArrayByDpositions {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        int d = s.nextInt();
        if(d>=n){
            d=d%n; 
        }

        //rotatebyDNaive(arr,d);
        //rotateLeftByD(arr,d);
        rotateArray(arr, d);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void rotatebyone(int arr[]){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }

    static void rotatebyDNaive(int arr[], int d){// Naive method: TC: Theta(nd)     Aux Space:Theta(1)
        for (int i = 0; i < d; i++) {
            rotatebyone(arr);
        }
    }

    static void rotateLeftByD(int[] arr, int d){// now since d is always smaller than n; we ignore d
        //Time Complexity: O(n) Aux Space: Theta(d)
        int n = arr.length;
        
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) { // Theta(d)
            temp[i]= arr[i];
        }

        for (int i = d; i < n; i++) {//Theta(n-d)
            arr[i-d]=arr[i];
        }

        for (int i = d-1; i >= 0; i--) {//Theta(d)
            arr[n-1]= temp[i];
            n--;
        }
        //or
        /*
         * for(int i=0;i<d;i++){
         *     arr[n-d+i]= temp[i]; 
         * }
         */

    }

    static void swap(int[]arr, int x,int y){
        int temp= arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    static void reversearr(int[] arr,int low, int high){
         while(low<high){
            swap(arr,low,high);
            low++;
            high--;
        }

    }

    static void rotateArray(int[] arr,int d){// most efficient method   TC: O(n)    Aux Space: O(1)
        int n = arr.length;
        reversearr(arr, 0, d-1); // reverse first d elements
        reversearr(arr, d, n-1);// reverse rest n-d elements
        reversearr(arr, 0, n-1);// reverse the whole array

    }
}
