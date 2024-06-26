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

		Resource resource = new ClassPathResource("applicationContext.xml");// xml 파일로 가서 자원이 있는지 확인 -> resource 변수로 xml 파일 관리
		BeanFactory factory = new XmlBeanFactory(resource);// bean 공장에서 객체 생성+ 주입
		Circle circle = (Circle)factory.getBean("circle"); // CircleImpl 객체의 id인 circle -> CircleImpl 객체를 가져옴
		circle.display(); // 가져온 CircleImpl 객체의 display() 메서드 호출
		
		System.out.println("---------------------------------------------");
		
		Point point = (Point)factory.getBean("point"); // PointImpl 객체의 id인 point -> PointImpl 객체를 가져옴
		double x = point.getXpos(); // 가져온 PointImpl 객체의 x 값, y 값을 가져오기 위해 각각의 getter 메서드 호출
		double y = point.getYpos();
		
		System.out.println(x + ", " + y);
	}
}
