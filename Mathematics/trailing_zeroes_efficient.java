package Mathematics;
import java.util.Scanner;
//efficient solution
public class trailing_zeroes_efficient {
    static int count(int n){
        int ans=0;
        for(int i=5;i<=n;i=i*5){// theta(log base 5(n)) or simply theta(log(n))
            ans = ans+ (n/i);
        }
        //else use this
        /*while(n!=0){
            n=n/5;
            ans = ans + n;
            
        }*/
        return ans;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
    }
}
