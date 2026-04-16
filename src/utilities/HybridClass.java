package utilities;

// Hybrid Inheritance

class Animal {
	void eat() {
		System.out.println("This animal eats");
	}
}

interface Fly{
	void fly();
}

interface Swim{
	void swim();
}

class Duck extends Animal implements Fly , Swim {
	
	public void fly() {
		System.out.println("The duck can fly");
	}
	
	public void swim() {
		System.out.println("The duck can swim");
	}
	
}

public class HybridClass {

	public static void main(String[] args) {
		Duck hyb = new Duck();
		
		hyb.eat();
		hyb.fly();
		hyb.swim();

	}

}
