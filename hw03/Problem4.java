import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the x coordinate of the first point: ");
        double x1=in.nextDouble();
        System.out.print("Enter the y coordinate of the first point: ");
        double y1=in.nextDouble();
        System.out.print("Enter the x coordinate of the second point: ");
        double x2=in.nextDouble();
        System.out.print("Enter the y coordinate of the second point: ");
        double y2=in.nextDouble();
        double slope= (y2-y1)/(x2-x1);
        System.out.println("The slope for the line that connects two points "+x1+","+y1+" and "+x2+","+y2+" is "+slope);
    }
}