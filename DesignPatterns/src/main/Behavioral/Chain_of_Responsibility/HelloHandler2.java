package main.Behavioral.Chain_of_Responsibility;

/**
 * @author yu
 * 
 */
public class HelloHandler2 extends Handler {

	@Override
	public void handle(StringBuilder strBdr) {
		strBdr.append("Chain of Responsibility!");
	}

}
