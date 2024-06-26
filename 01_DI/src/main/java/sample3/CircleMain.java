package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CircleMain {

	public static void main(String[] args) {
//		double radius = 10.0;
//		
//		PointImpl point = new PointImpl();
//		point.setXpos(3.0); 
//		point.setYpos(4.0); 
//		
//		CircleImpl circle = new CircleImpl(radius, point);
//		circle.display();

		Resource resource = new ClassPathResource("applicationContext.xml");// xml ���Ϸ� ���� �ڿ��� �ִ��� Ȯ�� -> resource ������ xml ���� ����
		BeanFactory factory = new XmlBeanFactory(resource);// bean ���忡�� ��ü ����+ ����
		Circle circle = (Circle)factory.getBean("circle"); // CircleImpl ��ü�� id�� circle -> CircleImpl ��ü�� ������
		circle.display(); // ������ CircleImpl ��ü�� display() �޼��� ȣ��
		
		System.out.println("---------------------------------------------");
		
		Point point = (Point)factory.getBean("point"); // PointImpl ��ü�� id�� point -> PointImpl ��ü�� ������
		double x = point.getXpos(); // ������ PointImpl ��ü�� x ��, y ���� �������� ���� ������ getter �޼��� ȣ��
		double y = point.getYpos();
		
		System.out.println(x + ", " + y);
	}
}
