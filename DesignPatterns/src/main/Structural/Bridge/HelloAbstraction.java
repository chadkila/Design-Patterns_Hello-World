/**
 * This is refined abstraction that extends the interface defined by Abstraction
 */
package main.Structural.Bridge;

import main.HelloWorld;

/**
 * @author yu
 * 
 */
public class HelloAbstraction extends Abstraction {

	public HelloAbstraction(HelloWorld world) {
		super(world);
	}

	@Override
	public void helloWorld() {
		System.out.print(hello.hellWorld());
	}

}
