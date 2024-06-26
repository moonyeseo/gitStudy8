package sample2;

public class CircleImpl implements Circle{  // 주요 메서드를 꼭 작성하기 위해 인터페이스를 활용
	private double radius;
	private PointImpl point; //private double xpos;
											 //private double ypos; 정보를 가지고 있는 Point  변수
	
	public CircleImpl(double radius, PointImpl point) {
		super();
		this.radius = radius;
		this.point = point;
	}

	public void display() {
		System.out.println("원의 중심 : " + point.getXpos() + ", " + point.getYpos());
		System.out.println("원의 면적 : " + Math.PI * Math.pow(radius, 2.0)); // radius(반지름)의 제곱 * 3.14
	}
}
