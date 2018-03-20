package net.accenture.prebootcamp.oop;

public class Child extends Parent {
	String name = "Lucy";

	public void sleep() {
		System.out.println(name + " sleeps early");
	}

	public static void main(String... strings) {
		Child daughter = new Child();
		System.out.println(daughter.address);
		System.out.println(daughter.name);
		System.out.println(daughter.surname);
		Parent father = new Parent();
		System.out.println("Father name is " + father.name);
		father.sleep();
		daughter.sleep();

	}
}
