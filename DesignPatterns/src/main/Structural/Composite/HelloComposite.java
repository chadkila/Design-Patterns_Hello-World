/**
 * http://en.wikipedia.org/wiki/Composite_pattern
 * composite pattern is a partitioning design pattern. The composite pattern
 * describes that a group of objects is to be treated in the same way as a
 * single instance of an object. The intent of a composite is to "compose"
 * objects into tree structures to represent part-whole hierarchies. Implementing
 * the composite pattern lets clients treat individual objects and compositions
 * uniformly.
 */
package main.Structural.Composite;

import main.HelloWorld;
import java.util.*;

/**
 * HelloWorld works as component interface, this composite accepts and store
 * leaves that implements HelloWorld
 * 
 * @author yu
 * 
 */
public class HelloComposite implements HelloWorld {

	String hello;
	List<HelloWorld> list = new ArrayList<HelloWorld>();

	public void add(HelloWorld hw) {
		list.add(hw);
	}

	@Override
	public String helloWorld() {
		return hello;
	}

	public void display() {
		for (HelloWorld e : list) {
			System.out.print(e.helloWorld());
		}
	}

}
