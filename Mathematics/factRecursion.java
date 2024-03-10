package Mathematics;
import java.util.Scanner;
public class factRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fact(n));
        System.out.println(facttail(n,1));
    }

    static int facttail(int n, int k){
        if(n==0 || n==1)
        return k;
        
        return facttail(n-1,k*n);// equivalent tail recursive function of fact
        // which is faster than non tail recursive function
    }

    static int fact(int n){
        if(n==0 || n==1)
        return 1;

        return n*fact(n-1);
    }
}
