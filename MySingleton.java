package com.rifatiqbal.singleton_pattern;

public class MySingleton {

	private volatile static MySingleton singleton;
	// volatile - multiple threads being executed will handle the object correctly
	
	private MySingleton() {
		// private constructor - can only be used by the class
	}
	
	public static MySingleton getInstance() {
		if (singleton == null) {
			synchronized (MySingleton.class) {
				if (singleton == null) {
					System.out.println("creating the singleton instance");
					singleton = new MySingleton();
				}
			}
		}
		System.out.println("returning the singleton object");
		return singleton;
	}
}
