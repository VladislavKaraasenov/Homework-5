package homework.five.animals;

public class FlyingBird extends Bird implements Flyable {

	public FlyingBird() {

	}

	@Override
	public void flying() {
		System.out.println("Flying bird flies...");
	}

	@Override
	public void move() {
		System.out.println("Flying bird moves...");
	}

	@Override
	public void eat() {
		System.out.println("Flying bird eats...");
	}

	@Override
	public void memory() {
		System.out.println("Memory flying bird...");
	}

	@Override
	public void communicate() {
		System.out.println("Flying bird talks with another flying bird...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
