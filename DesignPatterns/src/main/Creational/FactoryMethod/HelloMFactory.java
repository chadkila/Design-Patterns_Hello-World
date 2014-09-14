package main.Creational.FactoryMethod;

import main.HelloWorld;

/**
 * The concrete creator.
 * 
 * @author yu
 * 
 */
public class HelloMFactory extends Factory {

	@Override
	public HelloWorld getProduct() {
		return new HelloProduct();
	}

}
