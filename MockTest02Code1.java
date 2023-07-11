package in.ineuron.com;

class Animal {
	public void makeSound(String sound) {
		System.out.println("Animal make: " + sound);
	}
}

class Dog extends Animal {
	public void makeSound(String msg) {
		System.out.println("Dog sounds: " + msg);
	}
}

class Cat extends Animal {
	public void makeSound(String msg) {
		System.out.println("Cat sounds: " + msg);
	}
}

class Cow extends Animal {
	public void makeSound(String msg) {
		System.out.println("Cow sounds: " + msg);
	}
}

public class MockTest02Code1 {

	public static void main(String[] args) {

		Animal anml = new Animal();
		anml.makeSound("animal sound");
		Dog dog = new Dog();
		dog.makeSound("bow bow");
		Cat cat = new Cat();
		cat.makeSound("meaw meaw");
		Cow cow = new Cow();
		cow.makeSound("amboo amboo");

	}

}
