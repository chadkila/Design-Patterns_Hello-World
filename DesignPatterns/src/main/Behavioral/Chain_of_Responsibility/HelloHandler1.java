package main.Behavioral.Chain_of_Responsibility;

/**
 * @author yu
 * 
 */
public class HelloHandler1 extends Handler {

	@Override
	public void handle(StringBuilder strBdr) {
		strBdr.append("Hello ");
	}

}
