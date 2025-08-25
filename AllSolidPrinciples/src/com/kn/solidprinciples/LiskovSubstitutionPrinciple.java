package com.kn.solidprinciples;

public class LiskovSubstitutionPrinciple {

	interface Animal {
		void sound();
	}

	static class Dog implements Animal {
		public void sound() {
			System.out.println("Dog makes Sound like Bow Bow");
		}
	}

	static class Cat implements Animal {
		public void sound() {
			System.out.println("Cat makes Sound like Meow Meow");
		}
	}

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound();  

		Animal cat = new Cat();
		cat.sound();  
	}
}
