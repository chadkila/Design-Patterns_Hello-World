package main.Structural.Facade;

import main.HelloWorld;

/**
 * This class works as sub system under facade.
 * 
 * @author yu
 * 
 */
public class SubHello2 implements HelloWorld {

	@Override
	public String helloWorld() {
		return "Facade";
	}

}
