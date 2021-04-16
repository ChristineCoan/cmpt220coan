import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int[] calculateDigits=count(str);
        for(int i=0;i<calculateDigits.length;i++){
            if (calculateDigits[i]!=0){
                System.out.println("Digit "+i+" occurs "+ calculateDigits[i]+" times");
            }
        }
    }   
    public static int [] count (String s){
        int [] temp=new int [10];
        for (int i=0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))){
                String a=Character.toString(s.charAt(i));
                int b =Integer.parseInt(a);
                temp[b]=temp[b]+1;
            }
        }
        return temp;
    }
}