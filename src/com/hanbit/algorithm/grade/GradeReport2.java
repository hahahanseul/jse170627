package com.hanbit.algorithm.grade;
import java.util.Scanner;
public class GradeReport2{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int kor=0, eng=0, math=0,total=0,avg=0; 
		String grade="",result="";
		
		System.out.print("Enter your name\n");
		String name=s.next();
		System.out.print("Enter your Korean Language score\n");
		kor=s.nextInt();
		System.out.print("Enter your English score\n");
		eng=s.nextInt();
		System.out.print("Enter your Math score\n");
		math=s.nextInt();
		
		total=kor+eng+math;
		avg=total/3;
		
		switch(avg/10){
			case 10 : case 9 : 
				grade = "A";
				result="great";
			break; 			
			case 8 : 
				grade = "B";
				result="good";
			break; 			
			case 7 : 
				grade = "C";
				result="not bad";
			break; 			
			case 6 : 
				grade = "D";
				result="pass";
			break; 			
			case 5 :
				grade = "E";
				result="fail";
			break;
			default : 
				grade = "F";
				result="FAIL";
			break;
		}
		
		
		System.out.print("***********************************\n");
		System.out.print("  name	   total    avg     grade\n");
		System.out.print("-----------------------------------\n");
		System.out.print(String.format("|%s |  %d  |   %d   |   %s   |\n",name,total,avg,grade));
		System.out.print("***********************************\n");
		System.out.print(result);
	}
}