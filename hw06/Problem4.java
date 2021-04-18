import java.util.*;

public class Problem4 {
	public static void main(String[] args) {
		int i;
		int j;
		// float det;
		double mat[][] = new double[2][2];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b, c, d: ");
		for (i = 0; i < 2; ++i)
			for (j = 0; j < 2; ++j)
				mat[i][j] = in.nextDouble();
		// det = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
		double[][] inverse = inverse(mat);
		for (i = 0; i < 2; ++i) {
			for (j = 0; j < 2; ++j)
				System.out.print((inverse[i][j]) + " ");
			System.out.println();
		}
	}

	public static double[][] inverse(double[][] mat) {
		int i;
		int j;
		double det;
		double[][] inv = new double[2][2];
		det = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
		inv[0][0] = mat[1][1];
		inv[1][1] = mat[0][0];
		inv[0][1] = -mat[0][1];
		inv[1][0] = -mat[1][0];
		for (i = 0; i < 2; ++i)
			for (j = 0; j < 2; ++j)
				inv[i][j] = inv[i][j] / det;
		return inv;
	}
}