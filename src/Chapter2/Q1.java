package Chapter2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 두 정수를 입력받아 합을 구해 출력하는 프로그램 
		System.out.print("두개의 정수 입력 > ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = x + y;
		System.out.println(x+ " + " + y +" = " + result);
		sc.close();
	}

}
