package basicjava;

import java.util.Scanner;

public class BasicJavaClass {
	public static void main(String[] args) {
		String name;
		int age;
		float height;  //178.5f -> typecasting
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=sc.nextLine();
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		System.out.println("Enter your height: ");
		height=sc.nextFloat();
		
		System.out.println("Hello World");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height: "+height+"cm");
	}
}
