/**
 * This is a concrete implementor that implements HelloWorld interface
 */
package main.Structural.Bridge;

import main.HelloWorld;

/**
 * @author yu
 * 
 */
public class HelloWorldImpl2 implements HelloWorld {

	@Override
	public String helloWorld() {
		return "Bridge!";
	}

}
