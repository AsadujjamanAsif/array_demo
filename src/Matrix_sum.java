import java.util.Scanner;

public class Matrix_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[2][3];
        int B[][] = new int[2][3];

        System.out.println("Enter element of A Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; c0l < 3; col++) {
                System.out.printf("A[%d][%d]", row, col);
                A[row][col] = input.nextInt();
            }
        }

        System.out.println("Enter element of B Matrix: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("B[%d][%d]", row, col);
                B[row][col] = input.nextInt();
            }
        }

        System.out.println("A: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.println(" " + A[row][col]);
            }
            System.out.println();
        }
        System.out.println("B: ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 2; col++) {
                System.out.println(" " + B[row][col]);
            }
            System.out.println();
        }
    }

}
