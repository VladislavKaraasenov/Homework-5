package homework.five.zoo.animals;

import homework.five.animals.Bird;

public class Hen extends Bird {

	@Override
	public void touchedByHuman() {
		System.out.println("The hen runs...");
	}
}
