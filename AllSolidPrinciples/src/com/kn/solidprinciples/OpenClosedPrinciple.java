package com.kn.solidprinciples;


interface A{
	void display();
	
}

class B implements A{


	public void display() {
		System.out.println("This class-B is Extending the Content without Disturbing the Superclass ");
		
	}
	
}
class C implements A{

	@Override
	public void display() {
		System.out.println("This Class-C is Extending the content Without Disturbing the superclass");
		
	}
	
}

public class OpenClosedPrinciple {

	public static void main(String[] args) {
		A ob1=new B();
		ob1.display();
		A ob2=new C();
		ob2.display();
	
		
	}

}
