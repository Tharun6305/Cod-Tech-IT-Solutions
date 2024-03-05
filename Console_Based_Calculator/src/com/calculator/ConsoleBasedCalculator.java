package com.calculator;

import java.util.Scanner;

public class ConsoleBasedCalculator {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			System.out.println("CONSOLE BASED SIMPLE CALCULATOR!!!");
			System.out.println("Enter First Number :=");
			double num1 = in.nextDouble();
			System.out.println("Enter Second Number :=");
			double num2 = in.nextDouble();
			System.out.println("Enter the operation like + - * / %:=");
			String choice = in.next();
			switch (choice) {

			case "+":

				System.out.println(num1 + num2);
				break;
			case "-":
				System.out.println(num1 - num2);
				break;
			case "*":
				System.out.println(num1 * num2);
				break;
			case "/":
				System.out.println(num1 / num2);
				break;
			case "%":
				System.out.println(num1 % num2);
				
				break;
			default:
				System.out.println("Invalid operation");
			}
			System.out.println("\nPress Enter to continue...");
			in.nextLine(); 
			in.nextLine();

		}

	}

}
