package oops;

public class Main {
	public static void main(String[] args) {
		Animal animal1= new Animal("Dog","Land");
//		animal1.setName("Dog");
		
		animal1.eat();
		animal1.sleep();
		
		System.out.println(animal1.getName());
		System.out.println(animal1.getHabitat());
	}
}
