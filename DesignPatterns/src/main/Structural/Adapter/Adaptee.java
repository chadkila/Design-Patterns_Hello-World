/**
 * http://msdn.microsoft.com/en-us/library/orm-9780596527730-01-04.aspx
 * An adapter helps two incompatible interfaces to work together. This is the
 * real world definition for an adapter. The adapter design pattern is used when
 * you want two different classes with incompatible interfaces to work together.
 * Interfaces may be incompatible but the inner functionality should suit the
 * need.
 * 
 */
package main.Structural.Adapter;

/**
 * @author yu
 * 
 */
public class Adaptee {
	public String helloWorld() {
		return "Hello Adapter!";
	}
}
