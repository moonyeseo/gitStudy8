package sample6;

public class MyInfo {
	private Person per;
	private Student stu;
	
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	public void personPrint() {
		// �̸�, ����, Ű, ��� ���
		System.out.println("name : " + per.getName());
		System.out.println("age : " + per.getAge());
		System.out.println("height : " + per.getHeight());
		System.out.println("hobby : " + per.getHobby());
	}
	
	public void studentPrint() {
		// ����, ����, �������(�̸�, ����, Ű, ���) ���
		System.out.println("kor : " + stu.getKor());
		System.out.println("eng : " + stu.getEng());
		System.out.println("name : " + stu.getPer().getName());
		System.out.println("age : " + stu.getPer().getAge());
		System.out.println("height : " + stu.getPer().getHeight());
		System.out.println("hobby : " + stu.getPer().getHobby());
	}
}
