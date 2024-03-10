package Mathematics;
import java.util.Scanner;
import java.util.*;

public class sieveofEratosthencs{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        seo(n);
        seo1(n);
        seo2(n);
    }
    //efficient solution
    static void seo(int n){
        boolean arr[]= new boolean[n+1];
        Arrays.fill(arr, true);// it fill all the values of arr as true

        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=2*i;j<=n;j=j+i){
                    arr[j]=false;
                }

            }
        }

        for(int i=2;i<=n;i++){
            if(arr[i])
            System.out.print(i+" ");
        }
    }

    //optimized version of efficient solution
    static void seo1(int n){//TC: O(n*loglogn)
        boolean arr[]=new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j=j+i){
                    arr[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){
            if(arr[i])
            System.out.print(i+" ");
        }
    }

    static void seo2(int n)// shorter optimized solution   TC: O(n*loglogn)
    {
        boolean arr[]= new boolean[n+1];

        for(int i=2;i<=n;i++){
            if(arr[i]){
                System.out.println(i);
            for(int j=i*i;j<=n;j=j+i){
                arr[j]=false;
            }
        }
        }
    }
}