package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class Plus {
	public static void main(String[] args) {
		System.out.print("계산기\n");
		Scanner s = new Scanner(System.in);
		//String name = s.next();
		//double dollar = s.nextDouble();
		System.out.print("Enter Integer\n");
		int a = s.nextInt();
		System.out.print("Enter Integer\n");
		int b = s.nextInt();
		int c = a + b;
		System.out.print("Result: " +c);
	}
}