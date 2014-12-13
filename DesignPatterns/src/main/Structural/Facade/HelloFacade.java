/**
 * http://en.wikipedia.org/wiki/Facade_pattern
 * A facade is an object that provides a simplified interface to a larger body
 * of code, such as a class library. A facade can:
 * Make a software library easier to use, understand and test, since the facade
 * has convenient methods for common tasks; 
 * Make the library more readable, for the same reason; 
 * Reduce dependencies of  outside code on the inner workings of a library, since 
 * most code uses the facade, thus allowing more flexibility in developing the 
 * system; 
 * Wrap a poorly designed collection of APIs with a single well-designed API (as 
 * per task needs).
 */
package main.Structural.Facade;

/**
 * @author yu
 * 
 */
public class HelloFacade {

	private SubHello1 hello1;
	private SubHello2 hello2;

	public HelloFacade() {
		this.hello1 = new SubHello1();
		this.hello2 = new SubHello2();
	}

	public String helloWorld() {
		return hello1.helloWorld() + " " + hello2.helloWorld() + "!";
	}
}
