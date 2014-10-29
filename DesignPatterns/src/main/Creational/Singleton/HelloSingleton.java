/*
 * http://en.wikipedia.org/wiki/Singleton_pattern
 * http://literatejava.com/jvm/fastest-threadsafe-singleton-jvm/
 * The challenge of writing a singleton is solving concurrent problem, that is
 * how to ensure multiple threads are using Singleton INSTANCE = new Singleton()
 * but only instance was created.
 * Initialization-on-demand holder solves this very elegantly by using jvm's 
 * features.
 */
package main.Creational.Singleton;

import main.HelloWorld;

/**
 * 
 * @author yu
 * 
 */
public class HelloSingleton implements HelloWorld {

	// constructor closed for outer classes
	private HelloSingleton() {

	}

	// this lazy-holder won't be executed only when JVM determines it must be
	// executed. Initializing this holder class is thread safe because JVM uses
	// lock when creating classes, it is guaranteed to be serial and
	// non-concurrent.
	private static class HelloSingletonHolder {
		private static final HelloSingleton INSTANCE = new HelloSingleton();
	}

	// first time calling this class, the lazy-holder will be executed and
	// trigger a thread-safe initialization process. And then no further
	// synchronization is required.
	public static HelloSingleton getInstance() {
		return HelloSingletonHolder.INSTANCE;
	}

	@Override
	public String helloWorld() {
		return "Hello Singleton!";
	}
}
