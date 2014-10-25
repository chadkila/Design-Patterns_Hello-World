/**
 * This is a concrete implementor that implements HelloWorld interface
 */
package main.Structural.Bridge;

import main.HelloWorld;

/**
 * @author yu
 * 
 */
public class HelloWorldImpl1 implements HelloWorld {

	@Override
	public String hellWorld() {
		return "Hello ";
	}

}
