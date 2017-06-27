package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
			Scanner s=new Scanner(System.in);
			System.out.print("Enter Num1\n");
			int a=s.nextInt();
			System.out.print("Enter Num2\n");
			int b=s.nextInt();
			System.out.print("Enter opcode 1.+ 2.- 3.* 4./ \n");
			int opcode=s.nextInt();
			int result=0;
			if(opcode==1){
				result=a+b;
			}else if(opcode==2){
				result=a-b;
			}else if(opcode==3){
				result=a*b;
			}else{
				result=a/b;
			}
			System.out.print("RESULT: " + result);
	} 
}