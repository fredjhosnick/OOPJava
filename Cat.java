package oopHomeWork;

public class Cat {

	private String color;
	private String coloreyes;
	private int weight;
	private int age;

	public Cat(String color, String coloreyes, int weight, int age) {

		super();
		this.color = color;
		this.coloreyes = coloreyes;
		this.weight = weight;
		this.age = age;

	}

	public Cat() {

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColoreyes() {
		return coloreyes;
	}

	public void setColoreyes(String coloreyes) {
		this.coloreyes = coloreyes;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void miu() {

		System.out.println("MIU-MIU!!!");
	}

	public void sleep() {

		System.out.println("RRR-RRR-RRR");
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", coloreyes=" + coloreyes + ", weight=" + weight + ", age=" + age + "]";
	}

}
