package Chapter2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2차원 평면에서 하나의 직사각형은 두 점으로 표현된다. (50,50) 과 (100 , 100)의 두점으로 이루어진 
		 * 사각형이 있다고 했을때 한점을 구성하는 정수 x 와 y 값을 입력받고 점 (x, y)가 직사각형에 있는 지 판별하는 프로그램을 만드시오
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x 와 y 의 값을 입력하시오 ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x >= 50 && x <= 100 && y >=50 &&  y <= 100 ) {
			System.out.println("(50,50) 과 (100 , 100) 의 사이에 있습니다.");
		}else {
			System.out.println("(50,50) 과 (100 , 100)에 없습니다.");
		}
		sc.close();
	}

}
