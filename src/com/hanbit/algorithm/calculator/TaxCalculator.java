package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.print("이름을 입력해주세요\n");
		String name=s.next();
		System.out.print("연봉을 입력해주세요\n");
		int salary=s.nextInt();
		double taxRate=0.097;
		int tax=(int)(salary*taxRate);
		System.out.print("*******************************************\n");
		System.out.print("  이름   |    연봉    |   세율   | 납부할 세금\n");
		System.out.print("-------------------------------------------\n");
		System.out.print(String.format(" %s |  %d만원  |  %d  | %d 만원\n",name,salary,(int)(taxRate*100),tax));
		System.out.print("*******************************************\n");
	}
}
/*이름과 연봉을 입력받아서
연봉***만원을 받으시는 xxx님께서 납부할 세금은 ???만원입니다.
로 출력하는 프로그램을 만들어주세요.
현재 세율은 9.7프로 입니다. 
세율 taxRate=0.097   double rate=0.097; */