import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;
        System.out.println("Enter 5number: ");
        for (int i = 0; i < 5; i++) {
            number[i] = input.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            sum = sum + number[i];
        }
        System.out.println("sum: " + sum);
        double avg = sum / 5;
        System.out.println("Average is: " + avg);
    }
}
