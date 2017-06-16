package homework.five.animals;

public class Mammal extends Vertebrate {

	public Mammal() {

	}

	@Override
	public void move() {
		System.out.println("Mammal moves...");
	}

	@Override
	public void eat() {
		System.out.println("Mammal eats...");
	}

	@Override
	public void memory() {
		System.out.println("Memory mammal...");
	}

	@Override
	public void communicate() {
		System.out.println("Mammal talks with another mammal...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
