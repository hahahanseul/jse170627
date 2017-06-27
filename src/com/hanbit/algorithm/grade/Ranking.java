package com.hanbit.algorithm.grade;
import java.util.Scanner;
public class Ranking{
	public static void main(String[]args){
		System.out.println("##### 성적 랭킹 #####");
		Scanner scan=new Scanner(System.in);
		int[] scores=new int[3];
		String[] names=new String[3];
		
		for(int i=0;i<3;i++){
			System.out.println("이름을 입력하세요.");
			names[i] = scan.next();
			System.out.println("점수를 입력하세요.");
			scores[i] = scan.nextInt();
		}
		
		int[] scoreRanking=new int[3];
		String[] nameRanking=new String[3];

		if(scores[0]>scores[1] && scores[0]>scores[2]){
			scoreRanking[0]=scores[0];
			nameRanking[0]=names[0];
			if(scores[1]>scores[2]){
				scoreRanking[1]=scores[1];
				nameRanking[1]=names[1];
				scoreRanking[2]=scores[2];
				nameRanking[2]=names[2];
			}else{
				scoreRanking[1]=scores[2];
				nameRanking[1]=names[2];
				scoreRanking[2]=scores[1];
				nameRanking[2]=names[1];
			}
		}else if(scores[1]>scores[0] &&scores[1]>scores[2]){
			scoreRanking[0]=scores[1];
			nameRanking[0]=names[1];
			if(scores[0]>scores[2]){
				scoreRanking[1]=scores[0];
				nameRanking[1]=names[0];
				scoreRanking[2]=scores[2];
				nameRanking[2]=names[2];
			}else{
				scoreRanking[1]=scores[2];
				nameRanking[1]=names[2];
				scoreRanking[2]=scores[0];
				nameRanking[2]=names[0];
			}
		}
		else{
			scoreRanking[0]=scores[2];
			nameRanking[0]=names[2];
			if(scores[0]>scores[1]){
				scoreRanking[1]=scores[0];
				nameRanking[1]=names[0];
				scoreRanking[2]=scores[1];
				nameRanking[2]=names[1];
			}else{
				scoreRanking[1]=scores[1];
				nameRanking[1]=names[1];
				scoreRanking[2]=scores[0];
				nameRanking[2]=names[0];
			}
		}
		for(int j=0;j<3;j++){
		System.out.println((j+1)+"등: "+ nameRanking[j] +", "+ scoreRanking[j] + "점");
		}
		
	}
}