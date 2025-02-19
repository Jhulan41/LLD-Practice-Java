package low_Level_Design_practice;

class Animal {

	public void animalSound() {
		System.out.println("Your animal");

	}

}

class Dog extends Animal {

	@Override
	public void animalSound() {
		System.out.println("Bow");
	}
}

class Cat extends Animal {

	@Override
	public void animalSound() {
		System.out.println("Mew");
	}

}

public class Polymorphism {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();

		myAnimal.animalSound();
		myDog.animalSound();
		myCat.animalSound();
	}
}
