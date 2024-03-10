package Mathematics;
import java.util.Scanner;

public class nosmallerthancurrentnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= s.nextInt();
        }
        smaller(arr);
    }
    static void smaller(int[] arr){
        int n=arr.length;
        int[] count = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i]>arr[j]){
                    count[i]++;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(count[i]);
        }
    }
}
