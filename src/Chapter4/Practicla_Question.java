package Chapter4;

import java.util.Scanner;

/*
 * main문을 각 class의 run메소드에서 선언 
*/
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
		}
		else {
			System.out.println("t는 r을 포함하지 않습니다.");
		}

		if (t.contains(s)) {
			System.out.println("t는 s를 포함합니다.");
		}
		else {
			System.out.println("t는 s를 포함하지 않습니다.");
		}
	}
}

class Circle{
	private double x,y;
	private int radius;
	
	public Circle(double x, double y , int radius) {
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
		
		for(int i = 0 ; i < c.length ; i++) {
			System.out.print("x , y , radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		
		for(int i = 0 ; i < c.length ; i++) {
			c[i].show();
		}
		sc.close();
	}
}

class CircleManager{
	private double x,y;
	private int radius;
	
	public CircleManager(double x, double y , int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("( " + this.x + " , " + this.y + " )" + this.radius);
	}
	
	public void BigCircle() {
		
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		CircleManager c[] = new CircleManager[3];
		
		for(int i = 0 ; i < c.length ; i++) {
			System.out.print("x , y , radius >> ");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new CircleManager(x,y,radius);
		}
		
		for(int i = 0 ; i < c.length ; i++) {
			c[i].show();
		}
		sc.close();
	}
}

public class Practicla_Question {

	public static void main(String[] args) {

	}
}
