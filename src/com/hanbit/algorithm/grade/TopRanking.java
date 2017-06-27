package com.hanbit.algorithm.grade;
import java.util.Scanner;
public class TopRanking{
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		int[] arr = {0,0,0,0,100};    //학생수, 합계, 평균, 최대, 최소
		System.out.print("1반의 총 학생 수는 몇 명?");
		arr[0]=scan.nextInt();
		int[] avgs = new int[arr[0]];
		for(int i=0;i<avgs.length;i++){
			System.out.print("학생의 평균 점수 입력하세요(100점 만점))");
			avgs[i]=scan.nextInt();
		}
		
		for(int i=0;i<avgs.length;i++){
			arr[1] += avgs[i];
		}
		
		arr[2]=arr[1]/arr[0];
		
		for(int i=0;i<avgs.length;i++){
			if(avgs[i]>arr[3]){
				arr[3]=avgs[i];
			}
			
			if(avgs[i]<arr[4]){
				arr[4]=avgs[i];
			}			
		}
		System.out.print("1반의 평균점수는 " + arr[2]);
		System.out.print("최대 점수는 " + arr[3]);
		System.out.print("최소 점수는 " + arr[4]);
	}
}