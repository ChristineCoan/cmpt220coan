import java.util.*;

public class Problem4 {
    public static void main(String args[]) {
        System.out.println("Enter number of rows:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Pascal Triangle:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + ncr(i, j));
            }
            System.out.println();
        }
    }

    public static int fact(int num) {
        int factorial;

        for (factorial = 1; num > 1; num--) {
            factorial *= num;
        }
        return factorial;
    }

    static int ncr(int n, int r) {
        return fact(n) / (fact(n - r) * fact(r));
    }
}
