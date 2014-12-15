/**
 * http://en.wikipedia.org/wiki/Flyweight_pattern
 * http://www.oodesign.com/flyweight-pattern.html
 * A flyweight is an object that minimizes memory use by sharing as much data as
 * possible with other similar objects; it is a way to use objects in large
 * numbers when a simple repeated representation would use an unacceptable amount
 * of memory.
 */
package main.Structural.Flyweight;

import main.HelloWorld;

/**
 * This class works concrete flyweight class while HelloWorld interface works as
 * flyweight interface.
 * 
 * @author yu
 * 
 */
public class HelloFlyweight implements HelloWorld {
	private String value;

	public HelloFlyweight(String str) {
		this.value = str;
	}

	@Override
	public String helloWorld() {
		return value;
	}
}
