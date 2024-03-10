package Mathematics;
// print all permutations of a string
import java.util.Scanner;

public class printAllPermutations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        int i=0;

        permute(str,i);
    }

    static void permute(String str,int i){
        if(i==str.length()-1){
            System.out.println(str);
            return;
        }
        
        for(int j=i;j<str.length();j++){
            str=swap(str,i,j);
            permute(str,i+1);
            str=swap(str,i,j);
        }
    

       
    }

    static String swap(String str,int i,int j){
        char[] charArray = str.toCharArray();
        char temp= charArray[i];
        charArray[i]= charArray[j];
        charArray[j]=temp;
        return String.valueOf(charArray);
        
    }
}
