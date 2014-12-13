package main.Structural.Facade;

import main.HelloWorld;

/**
 * This class works as sub system under facade.
 * 
 * @author yu
 * 
 */
public class SubHello1 implements HelloWorld {

	@Override
	public String helloWorld() {
		return "Hello";
	}

}
