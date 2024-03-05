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
			switch (choice) //Switch cases for performing all operations based on user choice
			{
                          case "+":             

				System.out.println(num1 + num2);  //Addition
				break;
					
			  case "-":
					
				System.out.println(num1 - num2);  //Subtraction
				break;
					
			  case "*":
					
				System.out.println(num1 * num2); //Multiplication
				break;
					
			  case "/":
					
				System.out.println(num1 / num2); //Division
				break;
					
			  case "%":
					
				System.out.println(num1 % num2); //Modular Division
			        break;
			  default:
					
				System.out.println("Invalid operation"); //If User not Enter a valid Operation Then it will show these message
			}
			
			System.out.println("\nPress Enter to continue...");
			in.nextLine(); 
			in.nextLine();

		}

	}

}
