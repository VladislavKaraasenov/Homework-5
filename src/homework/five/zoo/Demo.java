package homework.five.zoo;

import homework.five.animals.*;
import homework.five.zoo.animals.*;

public class Demo {
	public static void main(String[] args) {

		Fish fish = new Fish();
		Reptile lizard = new Lizard();
		Bird hen = new Hen();
		Mammal monkey = new Monkey();
		FlyingFish flyingFish = new FlyingFish();
		SwimmingReptile crocodile = new Crocodile();
		FlyingBird stork = new Stork();
		SwimmingBird swan = new Swan();
		SwimmingMammal dolphin = new Dolphin();
		FlyingMammal bat = new Bat();

		Zoo zoo = new Zoo(15);

		zoo.addAnimal(fish);
		zoo.addAnimal(lizard);
		zoo.addAnimal(hen);
		zoo.addAnimal(monkey);
		zoo.addAnimal(flyingFish);
		zoo.addAnimal(crocodile);
		zoo.addAnimal(stork);
		zoo.addAnimal(swan);
		zoo.addAnimal(dolphin);
		zoo.addAnimal(bat);

		fish.touchedByHuman();
		lizard.touchedByHuman();
		hen.touchedByHuman();
		monkey.touchedByHuman();
		flyingFish.touchedByHuman();
		crocodile.touchedByHuman();
		stork.touchedByHuman();
		swan.touchedByHuman();
		dolphin.touchedByHuman();
		bat.touchedByHuman();

		// Result is:
		// The fish swims to the bottom...
		// The lizard stands still and doesn't move...
		// The hen runs...
		// The monkey smiles...
		// The flying fish runs away jumping above the water...
		// The crocodile eats your hand...
		// The stork flies...
		// The swan swims away...
		// The dolphin plays...
		// The bat bites...

	}
}
