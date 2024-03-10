package Arrays;
import java.util.Scanner;

/*Given two binary arrays, arr1[] and arr2[] of the same size n.
Find the length of the longest common span (i, j) where j >= i
such that arr1[i] + arr1[i+1] + …. + arr1[j] = arr2[i] + arr2[i+1] + …. + arr2[j].
The expected time complexity is Θ(n). */
public class longest_span_with_same_sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = s.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter array1:");
        for(int i=0;i<n;i++){
            arr1[i]= s.nextInt();
        }

        System.out.println("Enter array2:");
        for(int i=0;i<n;i++){
            arr2[i]=s.nextInt();
        }

        longestSpan1(arr1,arr2);
        longestSpan2(arr1, arr2);

    }

    static void longestSpan1(int[]arr1, int[]arr2){// method1 with TC: O(n^2)
        int n= arr1.length;
        int maxlen =0, mi=0,mj=0;
        int sum1=0, sum2=0, len=0;
        for(int i=0;i<n;i++){
            sum1=0; sum2=0;
            for(int j=i;j<n;j++){
                sum1+=arr1[j];
                sum2+=arr2[j];
                if(sum1==sum2){
                    len = j-i+1;
                    if(len> maxlen){
                        maxlen=len;
                        mi=i;
                        mj=j;
                    }

                }
            }
        }
        System.out.println("maxlen: "+ maxlen+ ", where i="+mi+" and j="+mj);
    }

    static void longestSpan2(int[]arr1, int[]arr2){// method2 auxillary array
        int maxlen = 0;
        int presum1 = 0, presum2=0;

        int n = arr1.length;

        int[] diff = new int[2*n-1];

        for(int i=0;i<diff.length;i++){// intitalizing all the elements of array as -1
            diff[i]=-1;
        }

        for(int i=0;i<n;i++){
            presum1+= arr1[i];
            presum2+= arr2[i];

            int curr_diff= presum1-presum2;// this could be negative as well

            int diffindex= n+ curr_diff;// so make it positive by converting it from (-n to +n) to (0 to 2n+1)

            if(curr_diff==0){
                maxlen=i+1;
            }

            else if(diff[diffindex]==-1){
                diff[diffindex]=i;
            }
            else{
                int len= i - diff[diffindex];
                if(len>maxlen){
                    maxlen= len;
                }

            }
        }

       System.out.println(maxlen);

    }

    static void longestSpan3(int[]arr1, int[]arr2){// method3 using hashing

    }
}

