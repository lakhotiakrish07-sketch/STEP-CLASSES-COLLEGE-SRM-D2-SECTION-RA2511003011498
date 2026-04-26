import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double sum = 0.0;
        int index = 0;

        while (true) {
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            arr[index] = num;
            sum += num;
            index++;
        }

        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum = " + sum);

        sc.close();
    }
}