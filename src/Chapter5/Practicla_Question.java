package Chapter5;

import java.util.Scanner;

//------------------------------------------------------------------
//Q1 
class TV{
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		System.out.println(getSize()+"인치 " + this.color + "컬러");
	}
	
}
//------------------------------------------------------------------
//Q2
class IPTV extends ColorTV{
	private String address;
	
	public IPTV(int size , int color , String address) {
		super(size,color);
		this.address = address;
	}
	
	@Override
	void printProperty() {
		// TODO Auto-generated method stub	
		System.out.print("나의 IPTV는 " + this.address +"주소의 ");
		super.printProperty(); 
	}
}
//------------------------------------------------------------------
//Q3
abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	
	protected double ratio;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
		System.out.print(getSrcString() + "을 입력하세요 >> ");
		double val = sc.nextDouble();
		double res = convert(val);
		
		System.out.println("변환 결과 : "+res + getDestString() +" 입니다.");
		sc.close(); 
	}
}

class Won2Dollar extends Converter{
	
	private double won;
	
	Won2Dollar(double won){
		this.won = won;
	}
	@Override
	protected double convert(double src) {
		src /= won;
		return src;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "원";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "달러";
	}
	
}
// Q4

class Km2Mile extends Converter{

	private double mileTokm;
	Km2Mile(double mileTokm){
		this.mileTokm = mileTokm;
	}
	@Override
	protected double convert(double src) {
		// TODO Auto-generated method stub
		src /= mileTokm;
		return src;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "Mile";
	}
	
}
//------------------------------------------------------------------
// Q5 ~ Q8 
class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x , int y) {
		this.x = x;
		this.y = y;
	}
}

//Q5
class ColorPoint extends Point{

	private String color;
	public ColorPoint(int x, int y ,String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setXY(int x , int y) {
		super.move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return this.color +"색의" + "("+getX() + "," +getY()+")" +"의 점";
	}
	
}

//Q6 
class ColorPoint1 extends Point{

	private String color;
	public ColorPoint1() {
		super(0, 0);
		this.color = "BLACK";
	}
	public ColorPoint1(int x , int y) {
		super(x,y);
		this.color = "BLACK";
	}
	public void setXY(int x , int y) {
		super.move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return this.color +"색의" + "("+getX() + "," +getY()+")" +"의 점";
	}
	
}
//Q7
class Point3D extends Point {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void moveUp() {
		this.z += 1;
	}
	public void moveDown() {
		this.z -= 1;
	}
	
	public void setXY(int x, int y) {
		super.move(x, y);
	}
	
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + "," + this.z + ")의 점";
	}
}


//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------
//------------------------------------------------------------------

public class Practicla_Question {

	public static void main(String[] args) {
//		//------------------------------------------------------------------		
//		ColorTV myTV = new ColorTV(32,1024);
//		myTV.printProperty();
//		//------------------------------------------------------------------
//		IPTV myIPTV = new IPTV(32,2048,"192.1.1.2");
//		myIPTV.printProperty();
//		//------------------------------------------------------------------
//		Won2Dollar w = new Won2Dollar(1200);
//		w.run();
//		//------------------------------------------------------------------
//		Km2Mile w1 = new Km2Mile(1.6);
//		w1.run();
//		//------------------------------------------------------------------
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str +" 입니다. ");
		//------------------------------------------------------------------
		ColorPoint1 zeroPoint = new ColorPoint1();
		System.out.println(zeroPoint  +" 입니다. " );
		
		ColorPoint1 cp1 = new ColorPoint1();
		cp1.setXY(5, 5);
		cp1.setColor("RED");
		System.out.println(cp1.toString() +" 입니다. ");
		//------------------------------------------------------------------
		
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString()+" 입니다.");
		p.moveUp();
		System.out.println(p.toString()+" 입니다.");
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString()+" 입니다.");
		p.move(100, 200, 300);
		System.out.println(p.toString()+" 입니다.");

		//------------------------------------------------------------------
		//------------------------------------------------------------------
		//------------------------------------------------------------------
		//------------------------------------------------------------------
		
	}

}
