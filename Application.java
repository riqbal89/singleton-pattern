package com.rifatiqbal.singleton_pattern;

public class Application {

	public static void main(String[] args) {
		MySingleton.getInstance();
		System.out.println("got instance");
		
		MySingleton.getInstance();
	}
}
