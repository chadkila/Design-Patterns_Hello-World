/**
 * http://blog.csdn.net/lwj0310/article/details/24488803
 * It is used when the type of objects to create is determined by a prototypical
 * instance, which is cloned to produce new objects. This pattern is used to:
 * 
 * 1. avoid subclasses of an object creator in the client application, like the
 * abstract factory pattern does. 
 * 2.avoid the inherent cost of creating a new object in the standard way 
 * (e.g., using the 'new' keyword) when it is prohibitively expensive for a given application.
 */
package main.Creational.Prototype;

/**
 * @author yu
 * 
 */
public abstract class Prototype implements Cloneable {
	public abstract Prototype clonenew();
}
