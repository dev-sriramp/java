/**
 *INTEGER REPLACE
 *Consider a non-empty array of positive integers inarr. Identify and print outnum based on the
below logic
• For each element in inarr that contains at least one 6, replace all 6s present with 9 and
reverse the element.
• Find the average of elements in the updated inarr rounded to two decimal places and
assign it to outnum


For the given inarr, the elements with at least one 6 in them are 66 and 76. After replacing
the 6s in these elements with 9 and reversing them, the updated numbers are
66-99
76-97
The updated inarr is {43, 99, 225, 97}. The average of the elements in update inar rounded to
two decimal places is
(43+99+225+9734) = 464/4 = 116.0. Hence the output.



 */
import java.util.Scanner;

public class IR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String arr[] = sc.nextLine().split(",");
        sc.close();
        int total =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].contains("6")){
                String temp = arr[i];
                String empty = "";
                for(int j=temp.length()-1;j>=0;j--){
                    empty=empty+temp.charAt(j);
                }
                arr[i]=empty;
            }
            arr[i]=arr[i].replaceAll("6", "9");
            total+=Integer.parseInt(arr[i]);
        }
        double tot = total/arr.length;
        System.out.println(String.format("%.1f",tot));

    }
}
