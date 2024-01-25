package com.java.calci;

import java.util.Scanner;

public class Calculator {
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	public int sub(int num1, int num2) {

		return num1 - num2;
	}

	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	public int div(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of num1:");
		int num1 = sc.nextInt();
		System.out.println("Enter the value of num2:");
		int num2 = sc.nextInt();
		System.out.println("Addition of number is:" + cal.add(num1, num2));
		System.out.println("substraction of number is:" + cal.sub(num1, num2));
		System.out.println("multiplication of number is:" + cal.mul(num1, num2));
		System.out.println("division of number is:" + cal.div(num1, num2));
	}
}
