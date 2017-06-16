package homework.five.zoo.animals;

import homework.five.animals.SwimmingReptile;

public class Crocodile extends SwimmingReptile {

	@Override
	public void touchedByHuman() {
		System.out.println("The crocodile eats your hand...");
	}
}
