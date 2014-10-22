package main;

import main.Creational.AbstractFactory.*;
import main.Creational.Singleton.*;
import main.Creational.Builder.*;
import main.Creational.FactoryMethod.*;
import main.Creational.Prototype.*;
import main.Structural.Adapter.*;

/**
 * @author yu
 * 
 */
public class Main {

	public static void main(String args[]) {
		System.out.println("===========Creational===========");
		System.out.println("1. Abstract Factory: ");
		AbstractFactory factory = new HelloFactory();
		Subject sub = factory.createSubject();
		System.out.println(sub.hellWorld());

		System.out.println("2. Builder: ");
		Director director = new Director();
		HelloBuilder hello = new HelloBuilder();
		director.setBuilder(hello);
		director.constructProduct();
		System.out.println(director.getProduct().hellWorld());

		System.out.println("3. Factory Method: ");
		Factory creator = new HelloMFactory();
		System.out.println(creator.getProduct().hellWorld());

		System.out.println("4. Prototype: ");
		PrototypeManager manager = new PrototypeManager();
		manager.put("hello", new HelloPrototype("Hello Prototype!"));
		HelloPrototype prototype = (HelloPrototype) manager.get("hello")
				.clonenew();
		System.out.println(prototype.helloWorld());

		System.out.println("5. Singleton: ");
		HelloWorld singleton = HelloSingleton.getInstance();
		System.out.println(singleton.hellWorld());

		System.out.println("===========Structral============");
		System.out.println("1. Adapter: ");
		HelloWorld adapter = new HelloAdapter();
		System.out.println(adapter.hellWorld());
	}
}
