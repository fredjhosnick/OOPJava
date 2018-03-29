package oppTriangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Artrian triangle1 = new Artrian();
		triangle1.setSide1(2.5);
		triangle1.setSide2(3.2);
		triangle1.setSide3(4.2);
		triangle1.calcartrian();

		Artrian triangle2 = new Artrian(3.5, 6.3, 2.9);
		triangle2.calcartrian();

		System.out.println("The area of triangle 1 is: " + triangle1);
		System.out.println();
		System.out.println("The area of triangle 2 is: " + triangle2);

	}

}
