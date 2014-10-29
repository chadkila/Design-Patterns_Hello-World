/**
 * http://uule.iteye.com/blog/868224
 * This works as a leaf component that implements HelloWorld.
 */
package main.Structural.Composite;

import main.HelloWorld;

/**
 * @author yu
 * 
 */
public class HelloLeaf implements HelloWorld {

	String hello;

	public HelloLeaf(String str) {
		this.hello = str;
	}

	@Override
	public String helloWorld() {
		return hello;
	}

	public void display() {
		System.out.print(hello);
	}

}
