// Program Name: AgeCalculator
// Purpose: Calculate age based on birth year

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int currentYear;
        int birthYear;
        int age;

        System.out.print("Enter Current Year: ");
        currentYear = input.nextInt();

        System.out.print("Enter Birth Year: ");
        birthYear = input.nextInt();

        age = currentYear - birthYear;

        System.out.println("Your age is: " + age);
    }
}