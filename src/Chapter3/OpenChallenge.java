package Chapter3;

import java.util.Scanner;

public class OpenChallenge {
	static Scanner sc = new Scanner(System.in);
	static int count = 1;
	static void Play() {
		System.out.println("수를 결정하였습니다.");
		System.out.println("0 ~ 99");
		int r = 0;
		
		loop: while (true) {
			if(count == 1 ) {
				r = (int) (Math.random() * 100);
			}
			System.out.print(count + " > ");
			int num = sc.nextInt();
			if (r < num) {
				System.out.println("더 낮게");
			} else if (r > num) {
				System.out.println("더 높게");
			} else if (r == num) {
				System.out.println("맞았습니다. ");
				System.out.println("다시 하시겠습니까? (Y / N)");
				String yn = sc.next();
				if (yn.equals("y")) {
					count = 1;
					continue loop;
				} else if (yn.equals("n")) {
					break loop;
				}
			}
			count++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 카드 번호 맞추기 게임
		Play();
	}

}
