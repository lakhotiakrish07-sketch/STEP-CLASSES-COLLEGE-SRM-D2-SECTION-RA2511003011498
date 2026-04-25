public // Program Name: HeightConverter
// Purpose: Convert cm to feet and inches

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double heightCm;
        double totalInches;
        int feet;
        double inches;

        System.out.print("Enter height in centimeters: ");
        heightCm = input.nextDouble();

        totalInches = heightCm / 2.54;
        feet = (int) (totalInches / 12);
        inches = totalInches % 12;

        System.out.println("Height in feet: " + feet);
        System.out.println("Remaining inches: " + inches);
    }
} 
    

