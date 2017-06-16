package homework.five.animals;

public class ParameciumCaudatum extends Celled {

	@Override
	public void grow() {
		System.out.println("Paramecium caudatum grow...");
	}

	@Override
	public void move() {
		System.out.println("Paramecium caudatum moves...");
	}

	@Override
	public void eat() {
		System.out.println("Paramecium caudatum eats...");
	}

	@Override
	public void touchedByHuman() {
		System.out.println("...");
	}

}
