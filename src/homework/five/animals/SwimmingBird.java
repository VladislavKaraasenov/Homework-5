package homework.five.animals;

public class SwimmingBird extends Bird implements Swimable {

	public SwimmingBird() {

	}

	@Override
	public void swimming() {
		System.out.println("Swimming bird swims...");
	}

	@Override
	public void move() {
		System.out.println("Swimming bird moves...");
	}

	@Override
	public void eat() {
		System.out.println("Swimming bird eats...");
	}

	@Override
	public void memory() {
		System.out.println("Memory swimming bird...");
	}

	@Override
	public void communicate() {
		System.out.println("Swimming bird talks with another swimming bird...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
