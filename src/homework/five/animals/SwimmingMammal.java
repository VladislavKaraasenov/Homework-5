package homework.five.animals;

public class SwimmingMammal extends Mammal implements Swimable {

	public SwimmingMammal() {

	}

	@Override
	public void swimming() {
		System.out.println("Swimming mammal swims...");
	}

	@Override
	public void move() {
		System.out.println("Swimming mammal moves...");
	}

	@Override
	public void eat() {
		System.out.println("Swimming mammal eats...");
	}

	@Override
	public void memory() {
		System.out.println("Memory swimming mammal...");
	}

	@Override
	public void communicate() {
		System.out.println("Swimming mammal talks with another swimming mammal...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
