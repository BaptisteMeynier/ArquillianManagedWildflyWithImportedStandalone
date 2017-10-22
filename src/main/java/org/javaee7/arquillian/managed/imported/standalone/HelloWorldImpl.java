package org.javaee7.arquillian.managed.imported.standalone;

public class HelloWorldImpl implements HelloWorld {

	private static String HELLO_WORLD= "Hello world";
	
	public String print() {
		return HELLO_WORLD;
	}
	

}
