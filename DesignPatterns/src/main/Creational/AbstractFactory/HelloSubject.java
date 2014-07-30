/**
 * 
 */
package main.Creational.AbstractFactory;

/**
 * @author yu
 * 
 */
public class HelloSubject implements Subject {

	private String str;
	
	public HelloSubject(String str) {
		this.str = str;
	}

	public String getStr() {
		return str;
	}

}
