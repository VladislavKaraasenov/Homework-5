package homework.five.animals;

public class Amoeba extends Celled {

	@Override
	public void grow() {
		System.out.println("Amoeba grow...");
	}

	@Override
	public void move() {
		System.out.println("Amoeba moves...");
	}

	@Override
	public void eat() {
		System.out.println("Amoeba eats paramecium caudatum... ");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
