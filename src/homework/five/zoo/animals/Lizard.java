package homework.five.zoo.animals;

import homework.five.animals.Reptile;

public class Lizard extends Reptile {

	@Override
	public void touchedByHuman() {
		System.out.println("The lizard stands still and doesn't move...");
	}
}
