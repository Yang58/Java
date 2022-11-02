package Chapter2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		/*
		 * And OR 논리 연산을 입력 받아 결과를 출력하는 프로그램 작성
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("논리 연산 입력 > ");
		boolean a = sc.nextBoolean();
		String op = sc.next();
		boolean b = sc.nextBoolean();
		
		switch(op) {
		case "and":{
			if(a == true && b == true) {
				System.out.println("TRUE");
			}else {
				System.out.println("FALSE");
			}
		}
			
		case "or":
			if(a == false && b == false) {
				System.out.println("FALSE");
			}else {
				System.out.println("TRUE");
			}
			
		}
		sc.close();
	}

}
