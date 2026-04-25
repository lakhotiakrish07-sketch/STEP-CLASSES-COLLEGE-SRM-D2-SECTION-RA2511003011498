// Program Name: ProfitCalculator
// Purpose: Calculate profit and profit percentage

import java.util.Scanner;

public class ProfitCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double costPrice;
        double sellingPrice;
        double profit;
        double profitPercentage;

        System.out.print("Enter Cost Price: ");
        costPrice = input.nextDouble();

        System.out.print("Enter Selling Price: ");
        sellingPrice = input.nextDouble();

        profit = sellingPrice - costPrice;
        profitPercentage = (profit / costPrice) * 100;

        System.out.println("Profit is: " + profit);
        System.out.println("Profit Percentage is: " + profitPercentage + "%");
    }
}