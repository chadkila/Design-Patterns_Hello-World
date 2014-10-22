/**
 * This adapter works as a bridge between 'HelloWorld' interface and 'Adaptee'.
 * It returns adaptee's identifier.
 */
package main.Structural.Adapter;

import main.HelloWorld;

/**
 * @author yu
 * 
 */
public class HelloAdapter extends Adaptee implements HelloWorld {

	private Adaptee adaptee;

	public HelloAdapter(Adaptee adap) {
		this.adaptee = adap;
	}

	public HelloAdapter() {
	}

	@Override
	public String hellWorld() {
		if (adaptee != null) {
			return adaptee.helloWorld();
		} else {
			return super.helloWorld();
		}
	}

}
