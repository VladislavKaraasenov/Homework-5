package homework.five.animals;

public class Reptile extends Vertebrate {

	public Reptile() {

	}

	@Override
	public void move() {
		System.out.println("Reptile moves...");
	}

	@Override
	public void eat() {
		System.out.println("Reptile eats...");
	}

	@Override
	public void memory() {
		System.out.println("Memory reptile...");
	}

	@Override
	public void communicate() {
		System.out.println("Reptile talks with other reptile...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
