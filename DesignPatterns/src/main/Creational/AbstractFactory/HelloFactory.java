/**
 * 
 */
package main.Creational.AbstractFactory;

/**
 * @author yu
 *
 */
public class HelloFactory implements AbstractFactory{

	public Subject createSubject() {
		return new HelloSubject("Hello Abstract Factory!");
	}

}
