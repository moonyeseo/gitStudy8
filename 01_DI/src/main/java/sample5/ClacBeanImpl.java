package sample5;

public class ClacBeanImpl implements CalcBean{
	private int su1; // setter ����
	private int su2; // ������ ����
	
	public ClacBeanImpl(int su2) {
		super();
		this.su2 = su2;
	}

	public void calculate() {
		System.out.println("���� : " + (su1 + su2));
		System.out.println("���� : " + (su1 - su2));
		System.out.println("���� : " + (su1 * su2));
		System.out.println("������ : " + (su1 / su2));
		System.out.println("������ : " + (su1 % su2));
	}

	public int getSu1() {
		return su1;
	}

	public void setSu1(int su1) {
		this.su1 = su1;
	}
}
