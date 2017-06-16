package homework.five.zoo.animals;

import homework.five.animals.FlyingBird;

public class Stork extends FlyingBird {

	@Override
	public void touchedByHuman() {
		System.out.println("The stork flies...");
	}
}
