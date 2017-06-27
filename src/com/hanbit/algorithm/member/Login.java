package com.hanbit.algorithm.member;
import java.util.Scanner;
public class Login{
	public static final String USER_ID="kim";
	public static final String USER_PASS="1";
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.print("Login\n");
		System.out.print("Enter your ID\n");
		String id=s.next();
		System.out.print("Enter your PW\n");
		String pass=s.next();
		String result = "";
		if(!id.equals(USER_ID)){
			result = "존재하지 않는 아이디 입니다.";
		}else if(!pass.equals(USER_PASS)){
			result="비밀번호가 다릅니다.";
		}else{
			result="로그인에 성공하였습니다.";
		}
		System.out.print(result);
	}
}