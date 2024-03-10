package Mathematics;

import java.util.Scanner;

public class computingpower {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int p= s.nextInt();
       System.out.println(power(n,p));
       System.out.println(power1(n, p));
       System.out.println(power2(n, p));
    }
    //naive solution
    static int power(int n,int p){// TC: theta(p)
        if(p==0)
        return 1;
        int x=1;
        for(int i=1;i<=p;i++){
            x=n*x;
        }
        return x;
    }

    //efficient solution
    // recursive solution
    static int power1(int x,int n){// TC: Theta(logn)  Auxilary Space: Theta(logn)
        if(n==0)
        return 1;

        int temp = power1(x,n/2);
        temp= temp*temp;

        if(n%2==0)
        return temp;

        else
        return temp*x;

    }
    // iterative efficient solution
    static int power2(int x, int n){// TC: Theta(logn)  Auxilary Space: Theta(1)
        int res=1;
        while(n>0){
            if(n%2!=0){// bit 1
                res = res*x;
            }
            n=n/2;
            x=x*x;
        }
        return res;

    }
}
