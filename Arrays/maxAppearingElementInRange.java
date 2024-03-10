package Arrays;

import java.util.Scanner;

public class maxAppearingElementInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();

        int[] start = new int[n];
         int[] end= new int[n];

        for (int i = 0; i < n; i++) {
            start[i]= s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            end[i]= s.nextInt();
        }

        System.out.println(maxAppear(start, end));
        System.out.println(maxAppear1(start, end));

    }

    static int maxAppear(int[] left, int[] right){// naive solution TC:O(n*MAX)
        // here MAX=100 as given in the q that 0<=left[i]<=right[i]<100
        int n= left.length;
        int[] freq = new int[100];

        for (int i = 0; i < n; i++) {
            for (int j = left[i]; j <=right[i]; j++) {
                freq[j]++;
            }
        }

        int res=0;

        for (int i = 1; i < 100; i++) {
            if(freq[i]>freq[res]) res=i;
        }

        return res;

    }

    static int maxAppear1(int[] left, int[] right){// efficient sol TC:O(n+MAX)
        int n= left.length; int[] freq = new int[101];
        int res=0;

        for (int i = 0; i < n; i++) {// marking starting point and ending point of ranges
            // +1 for starting and -1 to next element of ending
            freq[left[i]]++; freq[right[i]+1]--;
        }

        for (int i = 1; i < 100; i++) {// getting prefix sum of freq array
            freq[i]= freq[i-1]+freq[i];
            if(freq[i]>freq[res]) res=i;
        }

        return res;

    }
}
