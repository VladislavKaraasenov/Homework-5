package homework.five.zoo.animals;

import homework.five.animals.SwimmingBird;

public class Swan extends SwimmingBird {

	@Override
	public void touchedByHuman() {
		System.out.println("The swan swims away...");
	}
}
