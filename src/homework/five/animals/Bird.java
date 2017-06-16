package homework.five.animals;

public class Bird extends Vertebrate {

	public Bird() {

	}

	@Override
	public void move() {
		System.out.println("Bird moves...");
	}

	@Override
	public void eat() {
		System.out.println("Bird eats...");
	}

	@Override
	public void memory() {
		System.out.println("Memory bird...");
	}

	@Override
	public void communicate() {
		System.out.println("Bird talks with other bird...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
