import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a postitive integer: ");
        int pInt=in.nextInt();
        int number=pInt;
        int factor=2;
        int coefficient=1;
        while (factor<=number){
            if (number%(factor*factor)==0){
                coefficient=coefficient*factor;
                number=number/(factor*factor);
            }
            else {
                factor++;
            }
        }
        System.out.print("sqrt ("+pInt + ") is ");
        if (number==1){
            System.out.print(coefficient);
        }
        if (coefficient>1 && number>1){ //1300
            System.out.print(coefficient+"sqrt ("+number + ")");
        }
        else if (number>1){ //31
            System.out.print("sqrt("+number+ ")");
        }

    }
}