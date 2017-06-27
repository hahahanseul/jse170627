package com.hanbit.algorithm.grade;
import java.util.Scanner;
public class GradeReport{
	public static void main(String[]args){
		// name, kor, eng, math
		// total, avg,
		// 홍길동 : B
		Scanner s=new Scanner(System.in);
		int kor=0, eng=0, math=0,total=0,avg=0; 
		String grade="";
		//initializing(초기화)->default 값을 설정   int=0; String=""; 
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
		
		if(90<=avg){
			grade="A";
		}else if(80<=avg){
			grade="B";
		}else if(70<=avg){
			grade="C";
			
		}else if(60<=avg){
			grade="D";
			
		}else if(50<=avg){
			grade="E";
			
		}else{
			grade="F";
		}
		System.out.print("***********************************\n");
		System.out.print("  이름	   총점    평균     등급\n");
		System.out.print("-----------------------------------\n");
		System.out.print(String.format("|%s |  %d  |   %d   |   %s   |\n",name,total,avg,grade));
		System.out.print("***********************************\n");
	}
}