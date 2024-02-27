
public class array_demo {
    public static void main(String[] args) {

        int[] number = new int[500];

        number[0] = 10;
        number[1] = 20;
        number[2] = 100;
        number[3] = 202;
        number[4] = 104;
        int sum = number[0] + number[1] + number[2] + number[3];
        int len = number.length;
        System.out.println(len);
        System.out.println("Sum: " + sum);
    }

}