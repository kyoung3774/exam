package 배주환;

public class Quiz6 {

	public static void main(String[] args) {
		
		BallPen ballPen = new BallPen(2, "100%", "blue");
		FountainPen fountainPen = new FountainPen(3, "80%", "몽블랑");
		
		Pen pen1 = new BallPen(2, "100%", "bule");
		Pen pen2 = new FountainPen(3, "80%", "몽블랑");
		
	}

}

//펜 클래스
class Pen {
	int thickness;
	String amount;
	
	public Pen(int thickness, String amount) {
		super();
		this.thickness = thickness;
		this.amount = amount;
	}

}

// 볼펜 클래스
class BallPen extends Pen{
	String color;

	public BallPen(int thickness, String amount, String color) {
		super(thickness, amount);
		this.color = color;
	}

}

// 만년필 클래스
class FountainPen extends Pen{
	String brand;

	public FountainPen(int thickness, String amount, String brand) {
		super(thickness, amount);
		this.brand = brand;
	}
	
}