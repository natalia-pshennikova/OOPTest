package net.accenture.prebootcamp.oop;

public class Grandson extends Child {
	String name = "Bob";

	public void sleep() {
		System.out.println(name + " sleeps very early...");
	}
	public static void main(String... strings) {
		Grandson grandson = new Grandson();
		
		grandson.sleep();
	}
	
}
