package homework.five.animals;

public class FlyingFish extends Fish implements Flyable {

	public FlyingFish() {

	}

	@Override
	public void flying() {
		System.out.println("Flying fish jumping over water...");
	}

	@Override
	public void move() {
		System.out.println("Flying fish moves...");
	}

	@Override
	public void eat() {
		System.out.println("Flying fish eats...");
	}

	@Override
	public void memory() {
		System.out.println("Memory of flying fish...");
	}

	@Override
	public void communicate() {
		System.out.println("Flying fish talking with another flying fish...");
	}

	@Override
	public void swimming() {
		System.out.println("Flying fish swims...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("The flying fish runs away jumping above the water... ");
	}

}
