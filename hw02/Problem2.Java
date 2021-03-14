import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the ball travel time in seconds: "); // JA
        double ttime=in.nextDouble();
        double acc=9.8;
        double v0=0;
        double distance=(v0*ttime)+acc*(Math.pow(ttime,2)/2);
        System.out.println("The height of the building is  "+ distance);
    }
}