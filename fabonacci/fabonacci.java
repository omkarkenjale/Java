package com.fabonacci;

import java.util.Scanner;

public class fabonacci {

	public static void main(String[] args) throws InvalidEntryException{
		int length,pointer;
		int num1 = 0, num2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter fabonacci sequence length: ");
		if(!sc.hasNextInt()) {
			throw new InvalidEntryException();
		}
		length = sc.nextInt();
		sc.close();
		for(int i = 0; i < length; i++) {
			System.out.print(" "+num1+" ");
			pointer = num1+num2;
			num1 = num2;
			num2 = pointer;
		}
		

	}

}
