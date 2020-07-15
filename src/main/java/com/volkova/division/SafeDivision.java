package main.java.com.volkova.division;

import java.util.Scanner;

public class SafeDivision {
    Scanner myScan = new Scanner(System.in);
    public void division() {
        System.out.println("Enter the first Number please");

        int number1 = myScan.nextInt();

        System.out.println("Enter second Number");
        int number2 = 0;
        double result = 0;

        while (number2 == 0) {
            number2 = myScan.nextInt();

            try {
                result = number1 / number2;
            } catch (ArithmeticException ArithmeticExc) {
                System.out.println("Oooops, something get wrong!");
                System.out.println("Try enter Number again");
            }
        }
        System.out.println("Result of division is: " + result);
    }
}
