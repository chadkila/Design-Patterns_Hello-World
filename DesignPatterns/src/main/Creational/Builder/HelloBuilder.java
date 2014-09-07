package main.Creational.Builder;

/**
 * http://zh.wikipedia.org/wiki/%E7%94%9F%E6%88%90%E5%99%A8%E6%A8%A1%E5%BC%8F
 * http://visionsky.blog.51cto.com/733317/385196
 * 
 * @author yu
 * 
 */
public class HelloBuilder extends Builder {

	@Override
	public void buildString() {
		product.setString("Hello Builder!");
	}
}
