package sample1;

public class Circle{
	private double radius;
	private Point point; //private double xpos;
											 //private double ypos; 정보를 가지고 있는 Point  변수
	
	public Circle(double radius, Point point) {
		super();
		this.radius = radius;
		this.point = point;
	}
	
	public void display() {
		// moon 삭제
		System.out.println("원의 면적 : " + Math.PI * Math.pow(radius, 2.0)); // radius(반지름)의 제곱 * 3.14
	}
}
