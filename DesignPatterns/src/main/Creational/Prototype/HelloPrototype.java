/**
 * 
 */
package main.Creational.Prototype;

/**
 * @author yu
 * 
 */
public class HelloPrototype extends Prototype {

	private String str;

	// could be parsed by different data for diversity
	public HelloPrototype() {
		str = new String("Hello Prototype!");
	}

	public HelloPrototype(String str) {
		this.str = str;
	}

	public String helloWorld() {
		return str;
	}

	@Override
	public Prototype clonenew() {
		Prototype prototype = null;
		try {
			prototype = (Prototype) this.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prototype;
	}

}
