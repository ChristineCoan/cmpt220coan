import java.util.*;
public class Problem2 {
	static final int X = 0;
    static final int Y = 1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        double[][] points = new double[3][2];
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();
        double[] point = getIntersectingPoint(points);
		if (point != null) {
            System.out.println("The intersecting point is at (" + point[0] + ", " + point[1]+")");
        }
	}
	public static double[] getIntersectingPoint(double[][] points) {
		double Xcentroid= (points[0][X]+points[1][X]+points[2][X])/3;
		double Ycentroid= (points[0][Y]+points[3][Y]+points[2][Y])/3;
		double [] point=new double [2];
		point [X]=Xcentroid;
		point [Y]=Ycentroid;
		return point;
	}
}