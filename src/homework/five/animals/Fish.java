package homework.five.animals;

public class Fish extends Vertebrate implements Swimable {

	public Fish() {

	}

	@Override
	public void move() {
		System.out.println("Fish moves...");
	}

	@Override
	public void eat() {
		System.out.println("Fish eats...");
	}

	@Override
	public void memory() {
		System.out.println("Memory of the fish...");
	}

	@Override
	public void communicate() {
		System.out.println("Fish talks with other fish...");
	}

	@Override
	public void swimming() {
		System.out.println("Fish swims...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("The fish swims to the bottom...");
	}

}
