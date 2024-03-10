package Arrays;

import java.util.Scanner;

public class minGroupFlips {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= s.nextInt();
        }

        minGroupFlips2(arr);
    }

    // static void minGroupFlips1(int[] arr){// naive solution with two traversals of array    O(n)
    //     int n= arr.length;

    //     int count0=0, count1=0;

    //     if(arr[0]==0) count0++;
    //     if(arr[0]==1) count1++;
    //     for (int i = 1; i < n; i++) {
    //         if(arr[i]==1 && arr[i-1]==0) count1++;
    //         if(arr[i]==0 && arr[i-1]==1) count0++;
    //     }

    //     if(count1>count0){
    //         int a=0, b=0;

    //         for(int i=1;i<n;i++){
    //             if(arr[i]==0){

    //             }
    //         }
    //     }
    // }

    static void minGroupFlips2(int[] arr){// efficient solution O(n) // atmost diff b/w two groups=1; if 1st and last element are same diff=1; if diff then difference=0;
        // we always flip the 2nd group
        int n= arr.length;
       
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0]){
                    System.out.print("from "+ i+ " to ");
                }
                else{
                    System.out.println( (i-1));
                }
            }
            
        }

        if(arr[n-1]!=arr[0]){
            System.out.println(n-1);
        }
        
    }
    
}
