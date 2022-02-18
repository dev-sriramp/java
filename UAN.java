import java.util.Scanner;

/**
 * UAN
 * 15,3,1,70,53,71
 * 153,370,371
 */
public class UAN {
    public static boolean armstrongNumber(String str){
        int len = str.length();
        int n = Integer.parseInt(str);
        int temp = n;
        int value = 0;
        while(n>0){
            int s = n%10;
            value = value+(int)Math.pow(s, len);
            n=n/10;
        }
        if(temp == value){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split(",");
        String finalone = "";
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                boolean flag = armstrongNumber(arr[i]+arr[j]);
                if(flag && !(finalone.contains(arr[i]+arr[j]))){
                    finalone = finalone+arr[i]+arr[j]+",";
                }
            }
        }
        System.out.println(finalone.substring(0,finalone.length()-1));
    }
}