// Program Name: UniversityDiscount
// Purpose: Calculate discount and final fee

import java.util.Scanner;

public class UniversityDiscount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double fee;
        double discountPercent;
        double discountAmount;
        double finalFee;

        System.out.print("Enter Course Fee: ");
        fee = input.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        discountPercent = input.nextDouble();

        discountAmount = (fee * discountPercent) / 100;
        finalFee = fee - discountAmount;

        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Fee to Pay: " + finalFee);
    }
}