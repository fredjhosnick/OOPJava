package oppTriangle;

public class Artrian {

	private double side1;
	private double side2;
	private double side3;
	private double result;
	private double p;

	Artrian(double side1, double side2, double side3) {

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double calcartrian() {
		this.p = (side1 + side2 + side3) / 2;
		this.result = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		return result;

	}

}
