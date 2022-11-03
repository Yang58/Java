package Chapter2;

import java.util.Scanner;

public class Ch2_ex {
	static Scanner sc = new Scanner(System.in);

	static void Q1() {
		System.out.print("원화를 입력하세요 : ");
		int m = sc.nextInt();
		double d = m / 1100;

		System.out.println(m + "원은 " + d + "입니다.");
	}

	static void Q2() {
		System.out.print("2자리수 정수 입력 ( 1~99) :");
		int n = sc.nextInt();

		int x = n / 10;
		int y = n % 10;

		if (x == y) {
			System.out.println("Yes~! 두자리의 수가 같습니다. ");
		} else {
			System.out.println("No~! 두자리의 수가 같지 않습니다. ");
		}
	}

	static void Q3() {
		System.out.print("돈의 액수를 입력하세요 : ");
		int money = sc.nextInt();

		System.out.println("50000 원 > " + money / 50000 + "\n10000원 > " + money % 50000 / 10000 + "\n1000원 > "
				+ money % 50000 % 10000 / 1000 + "\n100원 > " + money % 50000 % 10000 % 1000 / 100 + "\n50원 > "
				+ money % 50000 % 10000 % 1000 % 100 / 50 + "\n10원 > " + money % 50000 % 10000 % 1000 % 100 % 50 / 10
				+ "\n1원 > " + money % 50000 % 10000 % 1000 % 100 % 50 % 10 / 1);
	}

	static void Q4() {
		System.out.print("정수 3개 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		if (x < y && x > z || x < z && x > y) { // x가 중간일떄
			System.out.println(x + "  ");
		} else if (y < x && y > z || y < z && y > x) { // y가 중간일떄
			System.out.println(y + "  ");
		} else {
			System.out.println(z + "  ");
		}
	}

	static void Q5() {
		System.out.print("3개의 변의 길이 입력 ( 정수 )> ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		if ((x + y) > z || (x + z) > y || (z + y) > x) {
			System.out.println("삼각형이 됩니다. ");
		} else {
			System.out.println("삼각형을 만들수 없습니다.");
		}
	}

	static void Q6() {
		System.out.print("1~99 사이의 정수를 입력하세요 >> ");
		int num = sc.nextInt();

		if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9 || num < 10) {
			if (num < 10) {
				if (num == 3 || num == 6 || num == 9) {
					System.out.println("박수 짝 ");
				}
			} else {
				if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9) {
					System.out.println("박수 짝짝");
				} else {
					System.out.println("박수 짝 ");
				}
			}
		}
	}

	static void Q7() {
		System.out.print("점 (x,y)의 좌표를 입력하세요 > ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (100 <= x && x <= 200 && 100 <= y && y <= 200) {
			System.out.println("( " + x + " , " + y + " ) 는 사각형 안에 있습니다. ");
		}
	}

	static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x < rectx2) && (y >= recty1 && y < recty2))
			return true;
		return false;

	}

	static void Q8() {
		System.out.print("점 (x,y)의 좌표를 입력하세요 >");
		int x = sc.nextInt();
		int y = sc.nextInt();
		boolean b = inRect(x, y, 100, 100, 200, 200);
		if (b == true) {
			System.out.println("충돌");
		} else {
			System.out.println("충돌하지 않습니다.");
		}

	}

	static void Q9() {
		System.out.print("원의 중심과 반지름 입력>>");
		double rx = sc.nextDouble();
		double ry = sc.nextDouble();
		double cr = sc.nextDouble();
		System.out.print("점 입력>>");
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (Math.sqrt((rx - x) * (rx - x) + (ry - y) * (ry - y)) < cr) {
			System.out.print("점 ( " + x + " , " + y + " )는 원 안에 있다.");
		} else {
			System.out.print("점 ( " + x + " , " + y + " )는 원 안에 없다.");
		}
	}

	static void Q10() {
		System.out.print("첫번째 원의 중심과 반지름 입력>>");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double r1 = sc.nextDouble();
		System.out.print("두번째 원의 중심과 반지름 입력>>");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double r2 = sc.nextDouble();

		if (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)) <= r1 + r2) {
			System.out.print("두 원은 서로 겹친다");
		} else {
			System.out.print("두 원은 서로 겹치지 않는다");
		}
	}

	static void Q11() {
		// if else
		System.out.print("달을 입력하세요 > ");
		int month = sc.nextInt();

		if (month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if (month >= 6 && month <= 8) {
			System.out.println("여름");
		} else if (month >= 9 && month <= 11) {
			System.out.println("가을");
		} else if (month == 12 || month == 1 || month == 2) {
			System.out.println("겨울");
		} else {
			System.out.println("잘못입력");
		}
	}

	static void Q11_1() {
		// switch
		System.out.print("달을 입력하세요 > ");
		int month = sc.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못입력");
		}

	}

	static void Q12() {
		System.out.print(" 연산 >> ");
		double a = sc.nextDouble();
		String op = sc.next();
		double b = sc.nextDouble();
		double result = 0;

		switch (op) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "/":
			if (a == 0 || b == 0) {
				System.out.println("0으로 나눌수 없습니다. ");
			} else {
				result = a / b;
			}
			break;
		case "*":
			result = a * b;
			break;
		}
		System.out.println("결과 > " + result);
	}

	static void Q12_1() {
		System.out.print(" 연산 >> ");
		double a = sc.nextDouble();
		String op = sc.next();
		double b = sc.nextDouble();
		double result = 0;

		if (op.equals("+"))
			result = a + b;
		else if (op.equals("-"))
			result = a - b;
		else if (op.equals("*"))
			result = a * b;
		else if (op.equals("/")) {
			if (a == 0 || b == 0) {
				System.out.print("0으로 나눌 수 없습니다");
			} else {
				result = a / b;
			}
		}
		System.out.println("결과 > " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}

}
