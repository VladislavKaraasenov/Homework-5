package homework.five.animals;

public class Test {
	public static void main(String[] args) {

		Amoeba amoeba = new Amoeba();
		ParameciumCaudatum parameciumCaudatum = new ParameciumCaudatum();
		parameciumCaudatum.eat();
		amoeba.eat();

		// Result is:
		// Paramecium caudatum eat...
		// Amoeba eats paramecium caudatum...
	}
}
