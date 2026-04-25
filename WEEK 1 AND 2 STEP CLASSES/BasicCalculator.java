// Program Name: BasicCalculator
// Purpose: Perform +, -, *, /

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double num1, num2;
        double addition, subtraction, multiplication, division;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        addition = num1 + num2;
        subtraction = num1 - num2;
        multiplication = num1 * num2;
        division = num1 / num2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
    }
}