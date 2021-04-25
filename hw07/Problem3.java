import java.util.*;
public class Problem3 {
    static final int X = 0;
    static final int Y = 1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] points = new double[3][2];
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();
        double Finalarea = getTriangleArea(points);
		if (points == null) {
            System.out.println("The three points are on the same line");
        } 
        else {
            System.out.println("The area of the triangel is "+Finalarea);
        }
	}

    // JA: This is supposed to take Point objects as arguments
	public static double getTriangleArea(double[][] points) {
		double side1 = Math.pow(Math.pow(points[1][X] - points[0][X], 2) + Math.pow(points[1][Y] - points[0][Y], 2), 0.5);
		double side2 = Math.pow(Math.pow(points[2][X] - points[1][X], 2) + Math.pow(points[2][Y] - points[1][Y], 2), 0.5);
		double side3 = Math.pow(Math.pow(points[0][X] - points[2][X], 2) + Math.pow(points[0][Y] - points[2][Y], 2), 0.5);
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		return area;
	}
}