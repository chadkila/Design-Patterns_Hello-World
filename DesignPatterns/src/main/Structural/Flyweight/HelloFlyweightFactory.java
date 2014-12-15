package main.Structural.Flyweight;

import java.util.*;

import main.HelloWorld;

/**
 * The factory creates and manages flyweight objects. In addition the factory
 * ensures sharing of the flyweight objects. The factory maintains a pool of
 * different flyweight objects and returns an object from the pool if it is
 * already created, adds one to the pool and returns it in case it is new.
 * 
 * @author yu
 * 
 */
public class HelloFlyweightFactory {
	private Map<String, HelloWorld> flyweights = new HashMap<String, HelloWorld>();

	public HelloWorld getFlyweight(String name) {
		if (!flyweights.containsKey(name))
			flyweights.put(name, new HelloFlyweight(name));
		return flyweights.get(name);
	}
}
