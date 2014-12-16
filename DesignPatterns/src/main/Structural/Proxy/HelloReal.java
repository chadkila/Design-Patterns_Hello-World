package main.Structural.Proxy;

import main.HelloWorld;

/**
 * This class works as a real subject that proxy stands for.
 * 
 * @author yu
 * 
 */
public class HelloReal implements HelloWorld {
	private String hello = null;

	public HelloReal(String str) {
		this.hello = str;
	}

	@Override
	public String helloWorld() {
		return hello;
	}

}
