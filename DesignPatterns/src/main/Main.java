/**
 * 
 */
package main;

import main.Creational.AbstractFactory.*;
import main.Creational.Singleton.*;

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

		System.out.println("2. Singleton: ");
		HelloWorld singleton = HelloSingleton.getInstance();
		System.out.println(singleton.hellWorld());
	}
}
