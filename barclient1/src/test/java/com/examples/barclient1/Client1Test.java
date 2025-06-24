package com.examples.barclient1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple Client1.
 */
public class Client1Test {
	@Test
	public void testUseMyClass1() {
		Client1 client1 = new Client1();
		String message = client1.useMyClass1();
		assertEquals("Hello from MyClass1 in org.foo.example1!", message);
	}
}
