package main.Creational.FactoryMethod;

import main.HelloWorld;

/**
 * This is a concrete product class, which implements Hello World interface
 * 
 * @author yu
 * 
 */
public class HelloProduct implements HelloWorld {

	@Override
	public String hellWorld() {
		return "Hello Factory Method!";
	}

}
