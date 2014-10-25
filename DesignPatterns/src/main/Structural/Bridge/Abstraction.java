/**
 * http://en.wikipedia.org/wiki/Bridge_pattern
 * The bridge pattern is a design pattern used in software engineering which is
 * meant to
 * "decouple an abstraction from its implementation so that the two can vary independently".
 * The bridge uses encapsulation, aggregation, and can use inheritance to
 * separate responsibilities into different classes.
 */
package main.Structural.Bridge;

import main.HelloWorld;

/**
 * Defines the abstract interface and maintains the Implementor reference.
 * 
 * @author yu
 * 
 */
public abstract class Abstraction {
	protected HelloWorld hello;

	protected Abstraction(HelloWorld world) {
		this.hello = world;
	}

	public abstract void helloWorld();
}
