import java.util.Scanner;

public class SpecialNumbers {
    public static String fact(int n){
       String temp = new String();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
               temp=temp+" "+i+" "+(n/i);
               String sq = ""+(n/i);
               if(!temp.contains(sq)){
                   temp = temp+" "+sq;
               }
            }
        }
        return temp.trim();
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int count =0;
        int currentValue =0;
        String n = sc.nextLine();
        sc.close();
        for(int i=1;i<n.length();i++){
            String tempo = new String();
            String temp = ""+n.charAt(i-1)+n.charAt(i);
           tempo = fact(Integer.parseInt(temp));
           String arr[] = tempo.split(" ");
           int tempcount=0;
           for(int j=1;j<arr.length;j++){
               if(n.contains(arr[j])){
                   tempcount++;
               }
           }
           if(tempcount>=count){
               count = tempcount;
               if(currentValue<Integer.parseInt(temp)){
                   currentValue=Integer.parseInt(temp);
               }
           }
        }
        System.out.println(currentValue);

        
    }
}
