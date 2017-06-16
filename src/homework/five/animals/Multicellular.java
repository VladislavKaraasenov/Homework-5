package homework.five.animals;

public class Multicellular extends Animal {

	private String name;

	public Multicellular(String name) {
		this.name = name;
	}

	@Override
	public void move() {
		System.out.println("Multicellular animals moves...");
	}

	@Override
	public void eat() {
		System.out.println("Multicellular animals eats...");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
