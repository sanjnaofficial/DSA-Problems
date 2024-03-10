package Mathematics;
import java.util.Scanner;
// this solution can have overflow issues
public class trailing_zeroes {//overal time complexity=> theta(n)
    static int count(int n){
        int ans=0, fact=1;
        for(int i=2;i<=n;i++){// theta(n)
            fact = fact*i;
        }
        System.out.println(fact);

        while(fact!=0){//theta(n)
            if(fact%10==0){
                ans++;
                fact=fact/10;
            }
            else{
                break;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(count(n));
    }
}
