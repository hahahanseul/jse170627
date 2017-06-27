package com.hanbit.algorithm.member;
import java.util.Scanner;
public class SSN{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		String name="",ssn="", gender="";
		
		System.out.println("이름을 입력하세요.");
		name=s.next();
		System.out.println("주민등록번호를 입력하세요.");
		ssn=s.next();
		char ch = ssn.charAt(7);

		switch (ch){
			case '1': case '3':
				gender="male";
			break;
			case '2': case '4':
				gender="female";
			break;
			case '5': case '6':
				gender="foreigner";
			break;
			default : 
				gender="wrong id number";
		}
		System.out.print("***********************\n");
		System.out.print(String.format("  이름      성별  \n"));
		System.out.print("-----------------------\n");
		System.out.print(String.format(" %s    %s\n",name, gender));
		System.out.print("************************\n");
	}
}