package main;

import main.Creational.AbstractFactory.*;
import main.Creational.Singleton.*;
import main.Creational.Builder.*;
import main.Creational.FactoryMethod.*;
import main.Creational.Prototype.*;
import main.Structural.Adapter.*;
import main.Structural.Bridge.*;
import main.Structural.Composite.*;
import main.Structural.Decorator.*;
import main.Structural.Facade.*;
import main.Structural.Flyweight.*;
import main.Structural.Proxy.*;
import main.Behavioral.Chain_of_Responsibility.*;

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
		System.out.println(director.getProduct().helloWorld());

		System.out.println("3. Factory Method: ");
		Factory creator = new HelloMFactory();
		System.out.println(creator.getProduct().helloWorld());

		System.out.println("4. Prototype: ");
		PrototypeManager manager = new PrototypeManager();
		manager.put("hello", new HelloPrototype("Hello Prototype!"));
		HelloPrototype prototype = (HelloPrototype) manager.get("hello")
				.clonenew();
		System.out.println(prototype.helloWorld());

		System.out.println("5. Singleton: ");
		HelloWorld singleton = HelloSingleton.getInstance();
		System.out.println(singleton.helloWorld());

		System.out.println("===========Structral============");
		System.out.println("1. Adapter: ");
		HelloWorld adapter = new HelloAdapter();
		System.out.println(adapter.helloWorld());

		System.out.println("2. Bridge: ");
		Abstraction absts[] = new Abstraction[] {
				new HelloAbstraction(new HelloWorldImpl1()),
				new HelloAbstraction(new HelloWorldImpl2()) };
		for (Abstraction abst : absts) {
			abst.helloWorld();
		}
		System.out.println();

		System.out.println("3. Composite: ");
		HelloComposite root = new HelloComposite();
		root.add(new HelloLeaf("Hello "));
		root.add(new HelloLeaf("Composite!\n"));
		root.display();

		System.out.println("4. Decorator: ");
		HelloWorld decorator = new HelloDecorator(new HelloComponent());
		System.out.println(decorator.helloWorld());

		System.out.println("5. Facade: ");
		HelloFacade facade = new HelloFacade();
		System.out.println(facade.helloWorld());

		System.out.println("6. Flyweight: ");
		HelloWorld list[] = new HelloWorld[2];
		HelloFlyweightFactory flyFactory = new HelloFlyweightFactory();
		list[0] = flyFactory.getFlyweight("Hello");
		list[1] = flyFactory.getFlyweight("Flyweight!");
		String flyweight = list[0].helloWorld() + " " + list[1].helloWorld();
		System.out.println(flyweight);

		System.out.println("7. Proxy: ");
		HelloWorld proxy = new HelloProxy();
		System.out.println(proxy.helloWorld());

		System.out.println("===========Behvioral============");
		System.out.println("1. Chain of Responsibility");
		Handler helloChain = new HelloHandler1();
		helloChain.setNext(new HelloHandler2());
		System.out.println(helloChain.helloWorld());
	}
}
