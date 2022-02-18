import java.util.Scanner;
import java.util.Arrays;

/**
 * Soi
 * SUM OF INTERVALS IN A SORTED ARRAY
 * 
 * -5,5,1,-2,7
Sample Output
-7,9,0,20
Explanation
For the given inarr, move the negative elements to the beginning and positive elements to
the end while maintaining the input order results in -5,-2,5,1,7
Starting from the first number in the rearranged array, the pair of adjacent numbers, num1
and num2, their difference and the corresponding value to be added in outarr are:
1. num1= -5, num2= -2 difference = -2- (-5) =3; The difference is greater than 1. Hence,
missing numbers are -4 and -3, their sum is -7 and outarr becomes {-7}
2. num1=-2, num2 = 5: difference = 5 -(-2)=7; The difference is greater than 1. Hence,
missing numbers are -1,0,1,2,3,4, their sum is 9 and outarr becomes {-7,9}
3. num1= 5, num2 = 1: difference = 1-5= -4; Since the difference is negative add 0 to
outarr. Hence outarr becomes {-7,9,0}
4. num1= 1, num2= 7: difference = 7-1 = 6; The difference is greater than 1. Hence,
missing numbers are 2,3,4,5,6, their sum is 20 and outarr becomes {-7,9,0,20}
Hence the output
 */
public class Soi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ar[] = sc.nextLine().split(",");
        int temparr[] = new int[ar.length];
        int arr[] = new int[ar.length];
        for(int i=0;i<ar.length;i++){
            temparr[i] = Integer.parseInt(ar[i]);
        }
       
        int tempvalue = 0;
        for(int i=0;i<temparr.length;i++){
            if(temparr[i]<0){
                arr[tempvalue] = temparr[i];
                tempvalue++;
            }
        }
        for(int i=0;i<temparr.length;i++){
            if(temparr[i]>=0){
                arr[tempvalue] = temparr[i];
                tempvalue++;
            }
        }
        
        String s = "";
        for(int i=1;i<arr.length;i++){
            int temp = arr[i]-arr[i-1];
            //System.out.println(arr[i]-arr[i-1]);
            if(temp>1){
                int val =0;
                int tv = 0;
                int tv1 =0;
                if(arr[i-1]>arr[i]){
                    tv = arr[i];
                    tv1 = arr[i-1];
                }
                else{
                    tv = arr[i-1];
                    tv1 = arr[i];
                }
                 //System.out.println(tv+" "+tv1);
                for(int j=tv+1;j<tv1;j++){
                    val = val+j;
                }
                s=s+val+",";
            }
            else{
                s=s+"0,";
            }
        }
        System.out.println(s.substring(0,s.length()-1));
        
    }
}