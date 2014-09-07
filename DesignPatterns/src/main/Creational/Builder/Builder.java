package main.Creational.Builder;

/**
 * An abstract class of Builder, the concrete builder will extend this and parse
 * "hello world" into a product
 * 
 * @author yu
 * 
 */
abstract class Builder {
	protected Product product = new Product();

	public Product getProduct() {
		return product;
	}

	public abstract void buildString();
}
