import java.util.*;
public class Problem2 {
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
        double m= (y2-y1)/(x2-x1);
        double b= y1-(m*x1);
        if(m==1 || b==0){
            System.out.println("The line equation for two points "+ x1+","+y1+ " and "+x2+", "+y2+" is y = x");
        }
        else {
            System.out.println("The line equation for two points "+x1+","+y1+" and "+x2+","+y2+" is y= "+m+"x "+b);
        }
    }
}