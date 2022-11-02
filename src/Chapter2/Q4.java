package Chapter2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
//		 * 돈의 액수를 입력받아 잔돈의 개수를 판별

		Scanner sc = new Scanner(System.in);
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

}
