package Mathematics;
import java.util.Scanner;

public class factorialRecursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if(n==0 )
        return 1;

        return n*factorial(n-1);
    }
}
