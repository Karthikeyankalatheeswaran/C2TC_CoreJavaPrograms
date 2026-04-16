package utilities;

// Method Overriding
class Animals{
	void sound() {
		System.out.println("*Animal Sound*");
	}
}

class Dog extends Animals{
	void sound() {
		System.out.println("Barks");
	}
}

class Cat extends Animals{
	void sound() {
		System.out.println("Meow");
	}
}

public class ParentClass {

	public static void main(String[] args) {
		
		Animals cat = new Cat();
		Animals dog = new Dog();
		
		cat.sound();
		dog.sound();

	}

}


