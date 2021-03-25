import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double numSide=in.nextDouble();
        System.out.print("Enter the radius of the circle: ");
        double r=in.nextDouble();
        double angle=0;
        System.out.println("The Coordinates of the points on the polygon are: ");
        for (int i = 0; i < numSide; i++)
            {
                double x = r * Math.cos(angle);
                double y = r * Math.sin(angle);
                System.out.println( "("+x+", "+ y+")" +"\n");
                angle += 2 * Math.PI / numSide;
            
            }
    }
}