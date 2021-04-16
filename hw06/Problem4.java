import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        int i; 
        int j;
		float det;
		float mat[][] = new float[2][2];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a, b, c, d: ");
		for(i = 0; i < 2; ++i)
			for(j = 0; j < 2; ++j)
				mat[i][j] = in.nextFloat();
		det = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
		for(i = 0; i < 2; ++i)
			for(j = 0; j < 2; ++j)
				System.out.print((mat[i][j]/det) +" ");
	}
		
	public static double[][] inverse(double[][] A){
		int i; 
        int j;
		float det, temp;
		float mat[][] = new float[2][2];
		det = (mat[0][0] * mat[1][1]) - (mat[0][1] * mat[1][0]);
		temp = mat[0][0];
		mat[0][0] = mat[1][1];
		mat[1][1] = temp;
		mat[0][1] = - mat[0][1];
		mat[1][0] = - mat[1][0];
		for(i = 0; i < 2; ++i)
			for(j = 0; j < 2; ++j)
				System.out.print((mat[i][j]/det) +" ");
		return inverse(A);
	}
}