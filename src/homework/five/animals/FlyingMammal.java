package homework.five.animals;

public class FlyingMammal extends Mammal implements Flyable {

	public FlyingMammal() {

	}

	@Override
	public void flying() {
		System.out.println("Flying mammal flies...");
	}

	@Override
	public void move() {
		System.out.println("Flying mammal moves...");
	}

	@Override
	public void eat() {
		System.out.println("Flying mammal eats...");
	}

	@Override
	public void memory() {
		System.out.println("Memory flying mammal...");
	}

	@Override
	public void communicate() {
		System.out.println("Flying mammal talks with another flying mammal...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
