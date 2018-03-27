package oopHomeWork;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat catRodolf = new Cat();
		catRodolf.setColor("Yellow");
		catRodolf.setColoreyes("Blue");
		catRodolf.setWeight(5);
		catRodolf.setAge(8);
		catRodolf.sleep();
		catRodolf.miu();

		System.out.println();

		Cat catTomy = new Cat("Grey", "Black", 7, 10);

		System.out.println(catRodolf);
		System.out.println(catTomy);

	}

}
