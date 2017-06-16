package homework.five.zoo.animals;

import homework.five.animals.FlyingMammal;

public class Bat extends FlyingMammal {

	@Override
	public void touchedByHuman() {
		System.out.println("The bat bites...");
	}
}
