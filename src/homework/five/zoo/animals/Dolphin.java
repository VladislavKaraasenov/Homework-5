package homework.five.zoo.animals;

import homework.five.animals.SwimmingMammal;

public class Dolphin extends SwimmingMammal {

	@Override
	public void touchedByHuman() {
		System.out.println("The dolphin plays...");
	}
}
