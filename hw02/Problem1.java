import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the width of a rectangle ");
        double width=in.nextDouble();
        System.out.print("Enter the height of a rectangle ");
        double height=in.nextDouble();
        double perimeter= 2*(width+height);
        double area= width*height;
        double length= Math.sqrt((width*width)+(height*height));
        System.out.println("The perimeter is  "+ perimeter);
        System.out.println("The area is  "+ area);
        System.out.println("The length of the diagonal is  "+ length);
    }
}