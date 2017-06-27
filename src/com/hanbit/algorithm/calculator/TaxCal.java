package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class TaxCal{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int salary=0, payTax=0;
		double taxRate=0;
		System.out.print("이름을 입력해주세요\n");
		String name=s.next();
		System.out.print("연봉을 입력해주세요\n");
		salary=s.nextInt();
		if(salary>8800){
			taxRate=0.35;
			payTax=(int)(salary*taxRate);
		}else if(salary>4600){
			taxRate=0.26;
			payTax=(int)(salary*taxRate);
		}else if(salary>1200){
			taxRate=0.17;
			payTax=(int)(salary*taxRate);	
		} else{
			taxRate=0.08;
			payTax=(int)(salary*taxRate);
		}
		System.out.print("*******************************************\n");
		System.out.print("  이름   |    연봉    |   세율   | 납부할 세금\n");
		System.out.print("-------------------------------------------\n");
		System.out.print(String.format(" %s |  %d만원  |  %d 퍼센트 | %d 만원\n",name,salary,(int)(taxRate*100),payTax));
		System.out.print("*******************************************\n");
	}
}

/*1천200만원까지는 8%
1천 200만원 초과 ~ 4천600만원 이하 17%
4천 600만원 초과~ 8천 800만원 이하 26%
8천 800만원 초과 35% 등으로 조정된다.
*/