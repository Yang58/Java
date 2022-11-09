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
		for(int i = 0 ; i < DaySchedule.length ; i++) {
			DaySchedule[i] = new Day();
		}
	}

	void input() {
		System.out.println("스케쥴을 입력합니다");
		System.out.print("날짜 ( 1 ~ "+ day + " )? >> ");
		int n = sc.nextInt();
		System.out.println(DaySchedule[n-1].get());
		if(DaySchedule[n-1].get() == null) {
			System.out.print("할일 입력 >> ");
			String work = sc.next();
			DaySchedule[n-1].set(work);
			sc.nextLine();
		}else if(DaySchedule[n-1].get() != null){
			System.out.println("할일이 이미 있습니다. !! ");
			System.out.print("["+ n + "] 일의 ");
			DaySchedule[n-1].show();
		}
	}

	void view() {
		System.out.println("1. 전체 스케쥴 보기  2. 하루 스케쥴 보기 ");
		int sel = sc.nextInt();
		switch(sel) {
		case 1:
			// 전체 보기 
			for(int i = 0 ; i < DaySchedule.length ; i++) {
				System.out.print("["+ (i+1) + "] 일의 ");
				DaySchedule[i].show();
			}
			break;
		case 2:
			System.out.print("날짜 >> ");
			int n = sc.nextInt();
			System.out.print("["+ n + "] 일의 ");
			DaySchedule[n-1].show();
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

public class Practicla_Question {

	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
