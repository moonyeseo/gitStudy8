package sample5;

public class ClacBeanImpl implements CalcBean{
	private int su1; // setter ÁÖÀÔ
	private int su2; // »ı¼ºÀÚ ÁÖÀÔ
	
	public ClacBeanImpl(int su2) {
		super();
		this.su2 = su2;
	}

	public void calculate() {
		System.out.println("µ¡¼À : " + (su1 + su2));
		System.out.println("»¬¼À : " + (su1 - su2));
		System.out.println("°ö¼À : " + (su1 * su2));
		System.out.println("³ª´°¼À : " + (su1 / su2));
		System.out.println("³ª¸ÓÁö : " + (su1 % su2));
	}

	public int getSu1() {
		return su1;
	}

	public void setSu1(int su1) {
		this.su1 = su1;
	}
}
