package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class BigNumber{
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int a=0, b=0, c=0, bigNum =0, midNum =0, minNum=0;
		
		System.out.print("A 값을 입력하세요\n");
		a=s.nextInt();
		System.out.print("B 값을 입력하세요\n");
		b=s.nextInt();
		System.out.print("C 값을 입력하세요\n");
		c=s.nextInt();
		
		if(a<b){
			if(b<c){
				bigNum=c;
				midNum=b;
				minNum=a;
			}else{
				bigNum=b;
				if(a<c){
					midNum=c;
					minNum=a;
				}else{
					midNum=a;
					minNum=c;
				}	
			}
		}else{
			if(a<c){
				bigNum=c;
				midNum=a;
				minNum=b;
			}else{
				bigNum=a;
				if(b<c){
					midNum=c;
					minNum=b;
				}else{
					midNum=b;
					minNum=c;
				}	
			}
		}
		System.out.print(String.format("%d,%d,%d",bigNum,midNum,minNum));
	}
}

/*가장 큰 값부터 작은 순으로 나열하는 statement를 완성하시오
예를 들어 a=4, b=7. c=1을 입력했다면, 7,4,1이 되겠쇼
*/