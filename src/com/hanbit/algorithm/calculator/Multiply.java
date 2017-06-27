package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class Multiply{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Integer\n");
		int a = s.nextInt();
		System.out.print("Enter Integer\n");
		int b = s.nextInt();
		int c = a * b; 
		System.out.print("Result: " + c);
	}
}