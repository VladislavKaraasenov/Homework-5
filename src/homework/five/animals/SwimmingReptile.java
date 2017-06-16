package homework.five.animals;

public class SwimmingReptile extends Reptile implements Swimable {

	public SwimmingReptile() {

	}

	@Override
	public void swimming() {
		System.out.println("Swimming reptile swims...");
	}

	@Override
	public void move() {
		System.out.println("Swimming reptile moves...");
	}

	@Override
	public void eat() {
		System.out.println("Swimming reptile eats...");
	}

	@Override
	public void memory() {
		System.out.println("Memory swimming reptile...");
	}

	@Override
	public void communicate() {
		System.out.println("Swimming reptile talks with another swimming reptile...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
