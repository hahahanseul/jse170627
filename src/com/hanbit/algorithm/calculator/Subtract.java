package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class Subtract{
	public static void main(String[] args) {
		System.out.print("Enter Integer\n");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.print("Enter Integer\n");
		int b = s.nextInt();
		int c = a-b;
		System.out.println("Result: " + c);
	}
}