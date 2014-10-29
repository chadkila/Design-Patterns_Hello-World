/**
 * This concrete component class implements HelloWorld interface.
 * HelloWorld interface works as abstract component.
 */
package main.Structural.Decorator;

import main.HelloWorld;

/**
 * @author yu
 * 
 */
public class HelloComponent implements HelloWorld {

	private String hello;

	public HelloComponent(String str) {
		this.hello = str;
	}

	public HelloComponent() {
	}

	@Override
	public String helloWorld() {
		if (hello == null || hello.isEmpty())
			return "Hello ";
		else
			return hello;
	}

}
