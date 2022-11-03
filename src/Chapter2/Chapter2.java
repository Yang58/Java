package Chapter2;

import java.util.Scanner;

public class Chapter2 {
	Scanner sc = new Scanner(System.in);
	void Q1(){
		// 두 정수를 입력받아 합을 구해 출력하는 프로그램 
		System.out.print("두개의 정수 입력 > ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = x + y;
		System.out.println(x+ " + " + y +" = " + result);
	}

	void Q2() {
		/*
		 * 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다. (50,50) 과 (100 , 100)의 두점으로 이루어진 
		 * 사각형이 있다고 했을때 한점을 구성하는 정수 x 와 y 값을 입력받고 점 (x, y)가 직사각형에 있는 지 판별하는 프로그램을 만드시오
		*/
		System.out.println("x 와 y 의 값을 입력하시오 ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x >= 50 && x <= 100 && y >=50 &&  y <= 100 ) {
			System.out.println("(50,50) 과 (100 , 100) 의 사이에 있습니다.");
		}else {
			System.out.println("(50,50) 과 (100 , 100)에 없습니다.");
		}
	}
	
	void Q3() {
		/*
		 * And OR 논리 연산을 입력 받아 결과를 출력하는 프로그램 작성
		 * */
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
	}
	
	void Q4() {
//		 * 돈의 액수를 입력받아 잔돈의 개수를 판별
		System.out.println("돈의 액수를 입력하세요 ");
		int money = sc.nextInt();
		
		System.out.println(
				"50000 > " + money/50000 
				+"\n10000 > " + money%50000/10000
				+"\n5000 > " + money%50000%10000/5000
				+"\n1000 > " + money%50000%10000%5000/1000
				+"\n500 > " + money%50000%10000%5000%1000/500
				+"\n100 > " + money%50000%10000%5000%1000%500/100
				
				);
	}
	public static void main(String[] args) {
		

		
	}

}
