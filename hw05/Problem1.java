import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int value=in.nextInt();
        System.out.println("The binary equivalent of "+ value+" is "+ decimalToBinary(value));
    }
    public static String decimalToBinary (int value){
        String result="";
        return decimalToBinary(value,result);
    }
    public static String decimalToBinary (int value, String result){
        if (value/2==0){
            return(value%2)+result;
        }
        else{
            return decimalToBinary(value/2,(value%2)+result);
        }
    }
}