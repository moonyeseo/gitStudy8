package sample5;

public class MessageBeanImpl implements MessageBean{
	private String name; // 생성자 주입
	private String greeting; // setter 주입
	
	public MessageBeanImpl(String name) {
		super();
		this.name = name;
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println(greeting  + " " + name);
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
