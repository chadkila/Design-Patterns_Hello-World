/**
 * http://en.wikipedia.org/wiki/Decorator_pattern
 * http://www.tutorialspoint.com/design_pattern/decorator_pattern.htm
 * Decorator pattern (also known as Wrapper, an alternative naming shared with
 * the Adapter pattern) is a design pattern that allows behavior to be added to
 * an individual object, either statically or dynamically, without affecting the
 * behavior of other objects from the same class.
 */
package main.Structural.Decorator;

import main.HelloWorld;

/**
 * @author yu
 * 
 */
public class Decorator implements HelloWorld {

	protected HelloWorld decorate;

	public Decorator(HelloWorld decorate) {
		this.decorate = decorate;
	}

	@Override
	public String helloWorld() {
		return decorate.helloWorld();
	}

}
