package extend;

import extend.animal.Dog;
import extend.animal.Frog;

public class Abstruct01 {
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
		dog.cry();

		Frog frog = new Frog();
		frog.swim();
		frog.cry();

	}

}
