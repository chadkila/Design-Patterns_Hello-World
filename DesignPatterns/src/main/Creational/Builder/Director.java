package main.Creational.Builder;

/**
 * Client only needs to access director and name of concrete builder. The
 * process of building and all its inner variables are encapsulated for client.
 * Client will finally receive a well built product from director after defining
 * product's type and let builder construct product.
 * 
 * @author yu
 * 
 */
public class Director {
	private Builder builder;

	public void setBuilder(Builder bd) {
		builder = bd;
	}

	public Product getProduct() {
		return builder.getProduct();
	}

	public void constructProduct() {
		builder.buildString();
	}
}
