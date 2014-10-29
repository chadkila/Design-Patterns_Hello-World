/**
 * http://jiangyongyuan.iteye.com/blog/146306
 * This is concrete decorator, super class's reference to component is shared
 * and overrides behavior function.
 */
package main.Structural.Decorator;

import main.HelloWorld;

/**
 * @author yu
 * 
 */
public class HelloDecorator extends Decorator {

	public HelloDecorator(HelloWorld decorate) {
		super(decorate);
	}

	@Override
	public String helloWorld() {
		String str = decorate.helloWorld() + "Decorator!";
		return str;

	}

}
