package com.kn.solidprinciples;

public class InterfaceSegregationPrinciple {

	interface Walkable {
	    void walk();
	}

	interface Flyable {
	    void fly();
	}

	static class Dog implements Walkable {
	    public void walk() {
	        System.out.println("Dog walks");
	    }
	}

	static class Bird implements Walkable, Flyable {
	    public void walk() {
	        System.out.println("Bird walks");
	    }

	    public void fly() {
	        System.out.println("Bird flies");
	    }
	}

	public static void main(String[] args) {
	    Walkable dog = new Dog();
	    dog.walk();

	    Bird bird = new Bird();
	    bird.walk();
	    bird.fly();
	}
}
