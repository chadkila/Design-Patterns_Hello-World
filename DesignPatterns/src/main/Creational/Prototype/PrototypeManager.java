/**
 * 
 */
package main.Creational.Prototype;

import java.util.*;

/**
 * @author yu
 * 
 */
public class PrototypeManager {
	private HashMap<String, Prototype> protos = new HashMap<String, Prototype>();

	public void put(String key, Prototype p) {
		protos.put(key, p);
	}

	public Prototype get(String key) {
		return protos.get(key);
	}
}
