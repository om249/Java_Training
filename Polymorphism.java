package Introduction;



	
	class Animal {
	    void sound() {
	        System.out.println("Animal makes sound");
	    }
	}

	class Dog extends Animal {
	    // Method Overriding
	    void sound() {
	        System.out.println("Dog barks");
	    }

	    // Method Overloading
	    void eat() {
	        System.out.println("Dog eats food");
	    }

	    void eat(String food) {
	        System.out.println("Dog eats " + food);
	    }
	}
	
	public class Polymorphism {
	    public static void main(String[] args) {

	        Dog d = new Dog();

	        // Method Overloading
	        d.eat();
	        d.eat("bread");

	        // Method Overriding
	        d.sound();
	    }
	}

