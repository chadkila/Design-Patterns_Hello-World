/**
 * 
 */
package main;

import main.Creational.AbstractFactory.*;

/**
 * @author yu
 * 
 */
public class HelloWorld {

	public static void main(String args[]) {
		System.out.println("1. Abstract Factory: ");
		AbstractFactory factory = new HelloFactory();
		Subject sub = factory.createSubject();
		System.out.println(sub.getStr());
	}
}
