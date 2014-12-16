/**
 * A proxy, in its most general form, is a class functioning as an interface to
 * something else. The proxy could interface to anything: a network connection,
 * a large object in memory, a file, or some other resource that is expensive or
 * impossible to duplicate.
 */
package main.Structural.Proxy;

import main.HelloWorld;

/**
 * This class works as a proxy for HelloReal class
 * 
 * @author yu
 * 
 */
public class HelloProxy implements HelloWorld {

	private HelloReal helloWorld = null;

	@Override
	public String helloWorld() {
		if (helloWorld == null)
			helloWorld = new HelloReal("Hello Proxy!");
		return helloWorld.helloWorld();
	}

}
