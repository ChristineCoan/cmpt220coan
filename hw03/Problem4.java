import java.util.*;


public class Problem4 {
    public static void main(String[] args) {
        int num1=(int) (Math.random()*10);
        int num2=(int) (Math.random()*10);
        int answer=num1-num2;
        Scanner in =new Scanner (System.in);
        System.out.print("What is "+num1+"-"+num2+"?");
        int ans= in.nextInt();
        List <String> cList=Arrays.asList("Way to go","Correct","Excellent");
        Random rc= new Random();
        int rcanditem=rc.nextInt(cList.size());
        String randomCorrect=cList.get(rcanditem);
        List <String> wList=Arrays.asList("Incorrect", "Wrong", "not right");
        Random rw= new Random();
        int rwanditem=rw.nextInt(wList.size());
        String randomWrong=wList.get(rwanditem);
        if (num1-num2!=ans){
            System.out.println(randomWrong+" Should be "+answer);
        }
        else if (num1-num2==ans){
            System.out.println(randomCorrect);
        }
    }
}