import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a numerator: ");
        int numerator=in.nextInt();
        System.out.print("Enter a denominator: ");
        int denominator=in.nextInt();
        if(numerator<denominator){
            System.out.println(numerator +" / "+denominator +" is a proper fraction");
        }
        else if (numerator % denominator == 0){
            System.out.println(numerator +" / "+denominator +" is an improper fraction and it can be reduced to "+numerator/denominator);
        }
        else {
            System.out.print(numerator + " / " + denominator + " is an improper fraction and its mixed fraction is " + numerator / denominator + " + " +  
                numerator % denominator + " / " + denominator);
        }
    }
}