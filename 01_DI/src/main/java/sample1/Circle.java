package sample1;

public class Circle{
	private double radius;
	private Point point; //private double xpos;
											 //private double ypos; ������ ������ �ִ� Point  ����
	
	public Circle(double radius, Point point) {
		super();
		this.radius = radius;
		this.point = point;
	}
	
	public void display() {
		// moon ����
		System.out.println("���� ���� : " + Math.PI * Math.pow(radius, 2.0)); // radius(������)�� ���� * 3.14
	}
}
