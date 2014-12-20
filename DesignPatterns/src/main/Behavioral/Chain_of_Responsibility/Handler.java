/**
 * http://en.wikipedia.org/wiki/Chain-of-responsibility_pattern
 * http://www.oodesign.com/chain-of-responsibility-pattern.html
 * Chain-of-responsibility pattern is a design pattern consisting of a source of
 * command objects and a series of processing objects.[1] Each processing object
 * contains logic that defines the types of command objects that it can handle;
 * the rest are passed to the next processing object in the chain. A mechanism
 * also exists for adding new processing objects to the end of this chain.
 */
package main.Behavioral.Chain_of_Responsibility;

import main.HelloWorld;

/**
 * This class is the Handler interface and concrete handlers will implement the
 * handle function.
 * 
 * @author yu
 * 
 */
public abstract class Handler implements HelloWorld {
	private Handler next;

	public void setNext(Handler succ) {
		next = succ;
	}

	public abstract void handle(StringBuilder strBdr);

	public String helloWorld() {
		StringBuilder strBuilder = new StringBuilder();
		handle(strBuilder);
		if (next != null) {
			next.handle(strBuilder);
		}
		return strBuilder.toString();
	}
}
