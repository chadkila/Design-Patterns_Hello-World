package main.Creational.Singleton;

import main.HelloWorld;

/**
 * http://en.wikipedia.org/wiki/Singleton_pattern
 * 
 * @author yu
 * 
 */
public class HelloSingleton implements HelloWorld {

	private HelloSingleton() {

	}

	private static class HelloSingletonHolder {
		private static final HelloSingleton INSTANCE = new HelloSingleton();
	}

	public static HelloSingleton getInstance() {
		return HelloSingletonHolder.INSTANCE;
	}

	@Override
	public String hellWorld() {
		return "Hello Singleton!";
	}
}
