package main.Creational.Builder;

import main.HelloWorld;

/**
 * An entity of product, which implements HelloWorld interface and will accept
 * "Hello World" from the builder
 * 
 * @author yu
 * 
 */
public class Product implements HelloWorld {

	private String str = "";

	public void setString(String s) {
		this.str = s;
	}

	@Override
	public String hellWorld() {
		return str;
	}

}
