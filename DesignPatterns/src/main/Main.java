/**
 * 
 */
package main;

import main.Creational.AbstractFactory.*;
import main.Creational.Singleton.*;
import main.Creational.Builder.*;

/**
 * @author yu
 * 
 */
public class Main {

	public static void main(String args[]) {
		System.out.println("1. Abstract Factory: ");
		AbstractFactory factory = new HelloFactory();
		Subject sub = factory.createSubject();
		System.out.println(sub.hellWorld());

		System.out.println("2. Builder: ");
		Director director = new Director();
		HelloBuilder hello = new HelloBuilder();
		director.setBuilder(hello);
		director.constructProduct();
		System.out.println(director.getProduct().hellWorld());

		System.out.println("3. Singleton: ");
		HelloWorld singleton = HelloSingleton.getInstance();
		System.out.println(singleton.hellWorld());

	}
}
