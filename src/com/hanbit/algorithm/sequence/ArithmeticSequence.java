package com.hanbit.algorithm.sequence;
import java.util.Scanner;
public class ArithmeticSequence{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=9;i++){
			for(int j=2;j<=5;j++){
				System.out.print(String.format("%d*%d=%d\t",j,i,j*i));
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int k=1;k<=9;k++){
			for(int l=6;l<=9;l++){
				System.out.print(String.format("%d*%d=%d\t",l,k,l*k));
			}
			System.out.print("\n");
		}
	}
}