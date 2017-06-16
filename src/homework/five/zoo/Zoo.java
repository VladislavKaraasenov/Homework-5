package homework.five.zoo;

import homework.five.animals.*;

public class Zoo {

	private Animal[] animals;

	public Zoo(int maxCountOfAnimals) {
		animals = new Animal[maxCountOfAnimals];
	}

	public boolean addAnimal(Animal animal) {
		for (int index = 0; index < animals.length; index++) {
			if (animals[index] == null) {
				animals[index] = animal;
				return true;
			}
		}
		return false;
	}
}
