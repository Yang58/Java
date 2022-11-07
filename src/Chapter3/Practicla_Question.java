package Chapter3;

import java.util.Scanner;

import javax.xml.transform.Source;

public class Practicla_Question {
	static Scanner sc = new Scanner(System.in);

	static void Q2() {
		int n[][] = { { 1 }, { 1, 2, 3 }, { 1 }, { 1, 2, 3, 4 }, { 1, 2 } };
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void Q3() {
		System.out.print("정수를 입력하세요 > ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void Q4() {
		System.out.println("소문자 알파벳 하나를 입력해주세요");
		char c = sc.next().charAt(0);
		for (int i = 'a'; i <= (int) c; i++) {
			for (int j = i; j <= c; j++) {
				System.out.print((char) j);
			}
			System.out.println();
		}
	}

	static void Q5() {
		System.out.println("정수 10개를 입력하세요 >> ");
		int ar[] = new int[10];
		for (int i = 0; i < ar.length; i++) {
			int n = sc.nextInt();
			ar[i] = n;
		}

		System.out.print("3의 배수는 : ");
		for (int i : ar) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
	}

	static void Q6() {
		int unit[] = { 50000, 10000, 1000, 500, 100, 50, 10, 1 };
		System.out.print("금액을 입력하세요 : ");
		int n = sc.nextInt();
		for (int i = 0; i < unit.length; i++) {
			if (n / unit[i] != 0) {
				System.out.print(unit[i] + "원 짜리 : ");
				System.out.println(n / unit[i] + "개");
				n %= unit[i];
			}
		}
	}

	static void Q7() {
		int n[] = new int[10];
		double avg = 0;
		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 10 + 1);
			avg += n[i];
		}
		System.out.print("랜덤한 정수 : ");
		for (int i : n) {
			System.out.print(i + " ");
		}

		System.out.println("\n평균은 " + avg / n.length);
	}

	static void Q8() {
		System.out.print("정수 몇개 ?");
		int n = sc.nextInt();
		int ar[] = new int[n];

		for (int i = 0; i < ar.length; i++) {
			int input = (int) (Math.random() * 100 + 1);

			if (i == 0) {
				ar[i] = input;
			}
			for (int j = 0; j < i; j++) {
				if (ar[j] == input) {
					i--;
					break;
				}
				ar[i] = input;
			}
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
		}
	}

	static void Q9() {
		int ar[][] = new int[4][4];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}

	}

	static void Q10() {
		int ar[][] = new int[4][4];
		int a[] = new int[10];
		int b[] = new int[10];
		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 10) + 1;
			int a_r = (int) (Math.random() * 4);
			int b_r = (int) (Math.random() * 4);
			for (int j = 0; j <= i; j++) {
				if ((a[j] == a_r) && (b[j] == b_r)) {
					i--;
					break;
				}
				if (j == i) {
					a[i] = a_r;
					b[i] = b_r;
					ar[a_r][b_r] = r;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void Q13() {
		
		for(int i = 0 ; i < 100 ; i++) {
			int count=0;
			if((i%10==3) ||(i%10==6 )|| (i%10 == 9)) 
				count++;
			if((i/10==3) || (i/10==6) || (i/10 == 9)) 
				count++;
			if(count == 1) {
				System.out.println("짝");
			}else if(count ==2) {
				System.out.println("짝짝");
			}
			
		}
	}
	
	static void Q14() {
		String course[] = { "java" , "C++" , "HTML5" , "컴퓨터구조" , "안드로이드"};
		int score[] = { 95,88,76,62,55};
		while(true) {
			System.out.print("과목명 >> ");
			String sub = sc.next();
			if(sub.equals("그만")) {
				System.out.println("종료");
				break;
			}
			for(int i = 0 ; i < course.length ; i++	) {
				if(course[i].equals(sub)) {
					System.out.println(sub + "의 점수는 > " +score[i]);
					break;
				}
			}
			sc.nextLine();
		}
	}
	
	static void Q15() {
		System.out.print("곱하고자 하는 두 수 입력 >> ");
		while(true) {
			
			try {
				int n = sc.nextInt();
				int m = sc.nextInt();
				if(n == 0) {
					break;
				}
				System.out.println(n + " X " + m +" = " + n*m);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("실수는 입력하면 안됩니다.");
				break;
			}
		}
		sc.close();
	}
	static void Q16() {
		String str[] = {"가위","바위","보"};
		System.out.println("가위 바위 보 게임을 시작합니다.");
		while(true) {
			int str_random = (int)(Math.random()*3);
			System.out.print("가위 바위 보 >>");
			String user = sc.next();
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			switch(str_random) {
			case 0: // com 가위 
				if(user.equals("가위")) {
					System.out.println("사용자 >> " + user +", 컴퓨터 >> 가위 , 비겼습니다");
				}else if(user.equals("바위")){
					System.out.println("사용자 >> " + user +", 컴퓨터 >> 가위 , 사용자가 이겼습니다.");
				}else {
					System.out.println("사용자 >> " + user +", 컴퓨터 >> 가위 , 사용자가 졌습니다.");
				}
				break;
			case 1: // com 바위
				if(user.equals("가위")) {
					System.out.println("사용자 >> " + user +", 컴퓨터 >> 바위 , 사용자가 졌습니다.");
				}else if(user.equals("바위")){
					System.out.println("사용자 >> " + user +", 컴퓨터 >> 바위 , 비겼습니다");
				}else {
					System.out.println("사용자 >> " + user +", 컴퓨터 >> 바위 , 사용자가 이겼습니다.");
				}
				break;
			case 2: // com 보
				if(user.equals("가위")) {
					System.out.println("사용자 >> " + user +", 컴퓨터 >> 보 , 사용자가 이겼습니다.");
				}else if(user.equals("바위")){
					System.out.println("사용자 >> " + user +", 컴퓨터 >> 보 , 사용자가 졌습니다.");
				}else {
					System.out.println("사용자 >> " + user +", 컴퓨터 >> 보 , 비겼습니다");
				}
				break;
			}
			
		}
	
	}

	public static void main(String[] args) {
		Q16();
	}
}
