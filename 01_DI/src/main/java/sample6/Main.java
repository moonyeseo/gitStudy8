package sample6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Person ������ ����
		// Student setter ����
		// MyInfo setter ����
		
		// java
		PersonImpl per = new PersonImpl("����", 24, 167, "���ڱ�");
		
		StudentImpl stu = new StudentImpl();
		stu.setKor(100);
		stu.setEng(90);
		stu.setPer(per);
		
		MyInfo my = new MyInfo();
		my.setPer(per);
		my.setStu(stu);
		my.personPrint();
		System.out.println();
		my.studentPrint();
		
		System.out.println("------------------------------");
		
//		Resource resource = new ClassPathResource("applicationContext4.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
		
//		ApplicationContext factory = new FileSystemXmlApplicationContext("classpath:applicationContext4.xml");
		
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext4.xml");
		
		my = (MyInfo)factory.getBean("my");
		
		my.personPrint();
		System.out.println();
		my.studentPrint();
	}

}
