package sample2;

public class CircleImpl implements Circle{  // �ֿ� �޼��带 �� �ۼ��ϱ� ���� �������̽��� Ȱ��
	private double radius;
	private PointImpl point; //private double xpos;
											 //private double ypos; ������ ������ �ִ� Point  ����
	
	public CircleImpl(double radius, PointImpl point) {
		super();
		this.radius = radius;
		this.point = point;
	}

	public void display() {
		System.out.println("���� �߽� : " + point.getXpos() + ", " + point.getYpos());
		System.out.println("���� ���� : " + Math.PI * Math.pow(radius, 2.0)); // radius(������)�� ���� * 3.14
	}
}
