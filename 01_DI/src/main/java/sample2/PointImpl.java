package sample2;

public class PointImpl implements Point{ // 주요 메서드를 꼭 작성하기 위해 인터페이스를 활용
	private double xpos;
	private double ypos;
	
	public double getXpos() {
		return xpos;
	}
	public void setXpos(double xpos) {
		this.xpos = xpos;
	}
	public double getYpos() {
		return ypos;
	}
	public void setYpos(double ypos) {
		this.ypos = ypos;
	}	
}
