package Chapter4;

import java.util.Scanner;

/*
 * main문을 각 class의 run메소드에서 선언 
*/
//-------------------------------------------------------------------------------------------
//Q1
class TV {
	String s;
	int y;
	int in;

	TV(String s, int y, int in) {
		this.s = s;
		this.y = y;
		this.in = in;
	}

	void show() {
		System.out.println(this.s + "에서 만든 " + this.y + "년 형" + this.in + "인치 TV");
	}

	public void run() {

		TV myTv = new TV("LG", 2017, 32);
		myTv.show();

	}
}
//-------------------------------------------------------------------------------------------
//Q2

class Grade {
	int math;
	int science;
	int english;

	Grade(int math, int science, int english) {
		this.math = math;
		this.english = english;
		this.science = science;
	}

	int average() {
		int avg = (math + english + science) / 3;
		return avg;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학 , 과학 ,영어 순으로 3개의 점수 입력 >>");
		int math = sc.nextInt();
		int sci = sc.nextInt();
		int eng = sc.nextInt();
		Grade me = new Grade(math, sci, eng);
		System.out.println("평균은 " + me.average());
		sc.close();

	}
}
//-------------------------------------------------------------------------------------------
//Q3

class Song {
	String title;
	String artist;
	int year;
	String country;

	Song() {
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show() {
		System.out.println(this.year + "년 " + this.country + " 국적의 " + this.artist + "가 부른 " + this.title);
	}

	public void run() {

		Song mySong = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		mySong.show();

	}
}
//-------------------------------------------------------------------------------------------
//Q4

class Rectangle {
	int x, y, width, height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	int square() {
		return this.width * this.height;
	}

	public void show() {
		System.out.println(
				"( " + this.x + " , " + this.y + " )" + "에서 크기가 " + this.width + " X " + this.height + "인 사각형");
	}

	boolean contains(Rectangle r) {

		if ((this.x < r.x) && (this.y < r.y) && (this.x + this.width) > (r.x + r.width)
				&& (this.y + this.height) > (r.y + r.height)) {
			return true;
		} else {
			return false;
		}
	}

	public void run() {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);

		r.show();

		System.out.println("s의 면적은 " + s.square());
		if (t.contains(r)) {
			System.out.println("t는 r을 포함합니다.");
		} else {
			System.out.println("t는 r을 포함하지 않습니다.");
		}

		if (t.contains(s)) {
			System.out.println("t는 s를 포함합니다.");
		} else {
			System.out.println("t는 s를 포함하지 않습니다.");
		}
	}
}

// -------------------------------------------------------------------------------------------
// Q5
class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("( " + this.x + " , " + this.y + " )" + this.radius);
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];

		for (int i = 0; i < c.length; i++) {
			System.out.print("x , y , radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}

		for (int i = 0; i < c.length; i++) {
			c[i].show();
		}
		sc.close();
	}
}

//-------------------------------------------------------------------------------------------
// Q6
class CircleManager {
	private double x, y;
	private int radius;

	CircleManager() {
	}

	public CircleManager(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("( " + this.x + " , " + this.y + " )" + this.radius);
	}

	public void BigCircle(CircleManager[] cm) {
		if (cm[0].radius > cm[1].radius && cm[0].radius > cm[2].radius) {
			cm[0].show();
		} else if (cm[1].radius > cm[0].radius && cm[1].radius > cm[2].radius) {
			cm[1].show();
		} else {
			cm[2].show();
		}

	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		CircleManager c[] = new CircleManager[3];

		for (int i = 0; i < c.length; i++) {
			System.out.print("x , y , radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new CircleManager(x, y, radius);
		}

		System.out.print("가장 면적이 큰 원은 ");
		BigCircle(c);
		sc.close();
	}
}

// -------------------------------------------------------------------------------------------
// Q7
class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null) {
			System.out.println("할 일이 없습니다.");
		} else {
			System.out.println("할일은 [ " + work + " ] 입니다. ");
		}
	}

}

class MonthSchedule {
	private int day;
	private Day DaySchedule[];
	Scanner sc = new Scanner(System.in);

	MonthSchedule(int day) {
		this.day = day;
		this.DaySchedule = new Day[this.day];
		for (int i = 0; i < DaySchedule.length; i++) {
			DaySchedule[i] = new Day();
		}
	}

	void input() {
		System.out.println("스케쥴을 입력합니다");
		System.out.print("날짜 ( 1 ~ " + day + " )? >> ");
		int n = sc.nextInt();
		System.out.println(DaySchedule[n - 1].get());
		if (DaySchedule[n - 1].get() == null) {
			System.out.print("할일 입력 >> ");
			String work = sc.next();
			DaySchedule[n - 1].set(work);
			sc.nextLine();
		} else if (DaySchedule[n - 1].get() != null) {
			System.out.println("할일이 이미 있습니다. !! ");
			System.out.print("[" + n + "] 일의 ");
			DaySchedule[n - 1].show();
		}
	}

	void view() {
		System.out.println("1. 전체 스케쥴 보기  2. 하루 스케쥴 보기 ");
		int sel = sc.nextInt();
		switch (sel) {
		case 1:
			// 전체 보기
			for (int i = 0; i < DaySchedule.length; i++) {
				System.out.print("[" + (i + 1) + "] 일의 ");
				DaySchedule[i].show();
			}
			break;
		case 2:
			System.out.print("날짜 >> ");
			int n = sc.nextInt();
			System.out.print("[" + n + "] 일의 ");
			DaySchedule[n - 1].show();
			sc.nextLine();
			break;
		}
	}

	void finish() {
		System.out.println("스케쥴 관리 프로그램을 종료합니다.");
		sc.close();
	}

	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램 ");
		loop: while (true) {
			System.out.print("스케쥴 [ 1. 입력 , 2. 보기 , 3. 끝내기 ] >> ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3:
				finish();
				break loop;
			}
		}
	}
}

//-------------------------------------------------------------------------------------------
//Q8
class Phone {
	private String name;
	private String tel;

	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
}

class PhoneBook {
	Scanner sc = new Scanner(System.in);
	Phone p[];

	int sreach(String name) {
		for (int i = 0; i < p.length; i++) {
			if (p[i].getName().equals(name)) {
				return i;
			}
		}
		return 0;
	}

	public void run() {
		System.out.println("인원 수 : ");
		int person = sc.nextInt();
		p = new Phone[person];
		for (int i = 0; i < p.length; i++) {
			System.out.print("이름과 전화번호 >>");
			String name = sc.next();
			String tel = sc.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다. ");
		loop: while (true) {
			System.out.print("검색할 이름 : ");
			String src_name = sc.next();
			if (src_name.equals("그만")) {
				System.out.println("PhoneBook 종료");
				break loop;
			}
			int index = sreach(src_name);
			System.out.println(p[index].getName() + "의 번호는 " + p[index].getTel() + "입니다. ");
		}
	}
}

//-------------------------------------------------------------------------------------------
//Q9

class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {

		System.out.println(a.length + " " + b.length);
		int size = a.length + b.length;
		int[] c = new int[size];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		return c;

	}

	public static void print(int[] a) {
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print(" ]");

	}
}

class StaticEx {

	public void run() {
		int[] array1 = { 1, 5, 7, 9 };
		int[] array2 = { 3, 6, -1, 100, 77 };
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}

//-------------------------------------------------------------------------------------------
//Q10
class Dictionary {
	private static String[] kor = { "사랑", " 아기", "돈", "미래", "희망" };
	private static String[] eng = { "love", "baby", "money", "future", "hope" };

	public static String kor2Eng(String word) {
		// 검색 코드
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word)) {
				return eng[i];
			}
		}
		return null;
	}
}

class DicApp {

	Scanner sc = new Scanner(System.in);
	{
		System.out.println("한영 단어 검색 프로그램 입니다. ");
	}

	public void run() {

		loop: while (true) {
			System.out.print("한글 단어 >> ");
			String word = sc.next();
			if (word.equals("그만")) {
				System.out.println("종료합니다");
				break loop;
			}

			String Engword = Dictionary.kor2Eng(word);
			if (Engword == null) {
				System.out.println(word + "는 저의 사전에 없습니다. ");
				continue loop;
			}

			System.out.println(word + "은(는)  " + Engword + " 입니다. ");

		}
	}
}

//-------------------------------------------------------------------------------------------
//Q11

class Add {
	int a;
	int b;

	void setvalue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a + b;
	}
}

class Sub {
	int a;
	int b;

	void setvalue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a - b;
	}

}

class Mul {
	int a;
	int b;

	void setvalue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return a * b;
	}

}

class Div {
	int a;
	int b;

	void setvalue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {
		return this.a / this.b;
	}
}

class Calculate {
	Scanner sc = new Scanner(System.in);
	Add a = new Add();
	Sub s = new Sub();
	Mul m = new Mul();
	Div d = new Div();

	{
		System.out.println("계산 프로그램 ");
	}

	public void run() {
		System.out.print("두 정수와 연산자를 입력하세요 > ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		String op = sc.next();

		switch (op) {
		case "+":
			a.setvalue(x, y);
			System.out.println(a.calculate());
			break;
		case "-":
			s.setvalue(x, y);
			System.out.println(s.calculate());
			break;
		case "*":
			m.setvalue(x, y);
			System.out.println(m.calculate());
			break;
		case "/":
			d.setvalue(x, y);
			System.out.println(d.calculate());
			break;
		}
	}

}

//-------------------------------------------------------------------------------------------
//Q12

class Concert {
	Scanner sc = new Scanner(System.in);
	Concert_System CS[] = new Concert_System[3];
	int Line;
	String name;
	String LineCheck;

	{
		for (int i = 0; i < CS.length; i++) {
			CS[i] = new Concert_System();
		}
		System.out.println("================================");
		System.out.println("=== 명품 콘서트홀 예약 시스템입니다. ===");
		System.out.println("================================");
	}

	public void run() {
		
		loop: while (true) {
			
			System.out.print("1.예약  2.조회  3.예약취소  4.종료  >> ");
			int menu = sc.nextInt();
			if (menu >= 1 && menu <= 4) {
				switch (menu) {
				case 1:
					// 예약
					loop1:while(true) {
						System.out.print("좌석 구분 : (1~3) : [1.S]  [2.A]  [3.B]  >> ");
						Line = sc.nextInt();
						
						if(Line < 4 && Line > 0) {
							LineCheck = CS[Line - 1].LineCheck(Line);
							System.out.print(LineCheck + " ");

							for (int i = 0; i < CS[Line - 1].SeatLine.length; i++) {
								System.out.print(CS[Line - 1].SeatLine[i] + " ");
							}
							
							System.out.println();
							System.out.print("이름 >> ");
							name = sc.next();
							
							System.out.print("좌석 번호 (1~10) >> ");
							int seat = sc.nextInt();
							if(0 < seat && seat < 11) {

								LineCheck = CS[Line - 1].LineCheck(Line);
								System.out.print(LineCheck + " ");

								CS[Line - 1].Reserve(seat, name);
								break loop1;
							}else { // seat if 
								System.out.println("1 ~ 10번 좌석중에 골라주세요 ");
								continue loop1;
							}
						}else { // Line if 
							System.out.println("1 ~ 3번 라인을 골라주세요 ");
							continue loop1;
						}
						
					}
				
					break;

				case 2:

					// 조회
					for (int i = 0; i < 3; i++) {
						LineCheck = CS[i].LineCheck(i + 1);
						System.out.print(LineCheck + " ");

						for (int j = 0; j < CS[i].SeatLine.length; j++) {
							System.out.print(CS[i].SeatLine[j] + " ");
						}
						System.out.println();
					}
					System.out.println("<<< 조회를 완료하였습니다 >>>");
					break;

				case 3:

					// 취소
					lop: while (true) {
						System.out.print("좌석 구분 (1~3) : [1.S]  [2.A]  [3.B]  >> ");
						Line = sc.nextInt();
						LineCheck = CS[Line - 1].LineCheck(Line);
						System.out.print(LineCheck + " ");

						for (int i = 0; i < CS[Line - 1].SeatLine.length; i++) {
							System.out.print(CS[Line - 1].SeatLine[i] + " ");
						}

						System.out.println();
						System.out.print("이름 >> ");
						name = sc.next();

						LineCheck = CS[Line - 1].LineCheck(Line);
						System.out.print(LineCheck + " ");

						boolean b = CS[Line - 1].ReserveCancel(name);
						System.out.println();
						if (b) {
							System.out.println(CS[Line - 1].name + "님 예약 취소되었습니다. ");
							break lop;
						} else {
							System.out.println(name + "님 예약자가 아닙니다. 다시한번 확인해주세요 . ");
							System.out.println("예약 취소를 계속 하시겠습니까 ? (Y/N)");
							String ans = sc.next();
							if (ans.equals("Y")) {
								continue lop;
							} else {
								System.out.println("메인화면으로 돌어갑니다. ");
								break lop;
							}

						}
					}

					break;
				case 4:

					// 종료
					System.out.println("프로그램을 종료합니다.");
					break loop;
				}
			} else {
				System.out.println(" 1~4번 중에 골라주세요 !!!");
			}

		}

	}
}

class Concert_System {

	Scanner sc = new Scanner(System.in);
	String[] SeatLine = new String[10];
	String name;
	int seatNum;

	{
		for (int i = 0; i < 10; i++) {
			SeatLine[i] = "---";
		}
	}

	public String LineCheck(int LineNum) {

		if (LineNum == 1) {
			return "S >> ";
		} else if (LineNum == 2) {
			return "A >> ";
		} else {
			return "B >> ";
		}

	}

	public void Reserve(int Seat_Num, String name) {

		if (SeatLine[Seat_Num - 1].equals("---")) {
			SeatLine[Seat_Num - 1] = name;
			for (int i = 0; i < SeatLine.length; i++) {
				System.out.print(SeatLine[i] + " ");
			}
			System.out.println();
			System.out.println("[" + name + "님 /" + Seat_Num + "번 좌석] 예약 완료 ");
		} else {
			System.out.println("이미 예약된 좌석입니다.");
		}

	}

	public void SeatCheck() {

		for (int i = 0; i < SeatLine.length; i++) {
			System.out.print(SeatLine[i] + " ");
		}

	}

	public boolean ReserveCancel(String name) {

		for (int i = 0; i < SeatLine.length; i++) {
			if (SeatLine[i].equals(name)) {
				SeatLine[i] = "---";
				System.out.print(SeatLine[i] + " ");
				return true;
			} else {
				System.out.print(SeatLine[i] + " ");
			}
		}
		return false;

	}
}

public class Practicla_Question {

	public static void main(String[] args) {
		Concert c = new Concert();
		c.run();
	}
}
