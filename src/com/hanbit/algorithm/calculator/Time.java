package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class Time{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int rawSec=0,hour=0, min=0, sec=0;
		
		System.out.print("초를 입력하세요.\n");
		rawSec=s.nextInt();
		
		hour=rawSec/3600;
		min=(rawSec%3600)/60;
		sec=(rawSec%3600)%60;
		
		System.out.print(String.format("%d초 = %d시간 %d분 %d초", rawSec,hour, min,sec));
	}
}
/*초를 시간과 분으로 바꾸어주는 프로그램입니다.
초를 입력해주세요
60000
60000초 = 16시간 40분 0초
*/