package homework.five.zoo.animals;

import homework.five.animals.Mammal;

public class Monkey extends Mammal {

	@Override
	public void touchedByHuman() {
		System.out.println("The monkey smiles...");
	}
}
