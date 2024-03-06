import java.util.Scanner;

public class matrix_two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[3][3];
        int sumofDioEl = 0;
        int sumofUpperEl = 0;
        int sumofLowerEl = 0;
        // Matrix input
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                A[row][col] = input.nextInt();
            }
        }
        System.out.println("A: ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + A[row][col]);
            }
            System.out.println();
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row == col) {
                    sumofDioEl = sumofDioEl + A[row][col];
                }
                if (row < col) {
                    sumofUpperEl = sumofUpperEl + A[row][col];
                }
                if (row < col) {
                    sumofLowerEl = sumofLowerEl + A[row][col];
                }
            }
        }
        System.out.println("Sum of: " + sumofDioEl);
        System.out.println("Sum of: " + sumofUpperEl);
        System.out.println("Sum of: " + sumofLowerEl);
    }
}
