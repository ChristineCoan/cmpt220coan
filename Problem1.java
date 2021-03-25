import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Main menu\n 1: Addition\n 2: Subtraction\n 3: Multiplication\n 4: Division\n 5: Exit\n ");
        int userChoice = 0;
        System.out.println("Enter a choice:");
        userChoice = input.nextInt();
        while (userChoice != 5) {
            int firstNum = (int)(Math.random() * 10);
            int secondNum = (int)(Math.random() * 10);
        switch (userChoice) {
        case 1:
            int adding = firstNum + secondNum;
            System.out.println(firstNum +" + "+secondNum+"?");
            int addingInput = input.nextInt();
            if (addingInput == adding){
                System.out.println("correct");
            }
            else{
                System.out.println("Your answer is wrong. The correct answer is "+ adding);

            }
        break;

        case 2:
            int sub = firstNum - secondNum;
            System.out.println(firstNum +" - "+secondNum+"?");
            int subInput = input.nextInt();
            if (subInput == sub){
                System.out.println("correct");
            }
            else{
                System.out.println("Your answer is wrong. The correct answer is "+ sub);
            }
        break;

        case 3:
            int mult = firstNum * secondNum;
            System.out.println(firstNum +" * "+secondNum+"?");
            int multInput = input.nextInt();
            if (multInput == mult){
                System.out.println("correct");
            }
            else{
                System.out.println("Your answer is wrong. The correct answer is "+ mult);
            }
        break;

        case 4:
        while (secondNum == 0){ 
            secondNum = (int)Math.round((Math.random()*10));
        }
            double div = firstNum / secondNum;
            System.out.println(firstNum +" / "+secondNum+"?");
            double divInput = input.nextDouble();
            if (divInput == div){
                System.out.println("correct");
            }
            else{
                System.out.println("Your answer is wrong. The correct answer is "+ div);
            }
        break;

        case 5:
            System.exit(0); break;
        default:
            System.out.println("Error: Out of range");
            System.exit(0);
        }
        System.out.println("Enter a choice:");
        userChoice = input.nextInt();
        }
        System.out.println("Have a Great Day!:)");
    } 
}