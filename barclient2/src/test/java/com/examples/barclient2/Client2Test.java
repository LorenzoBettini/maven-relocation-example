package com.examples.barclient2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple Client2.
 */
public class Client2Test {
	@Test
	public void testUseMyClass1() {
		Client2 client1 = new Client2();
		String message = client1.useMyClass2();
		assertEquals("Hello from MyClass1 in org.foo.example1! And MyClass2 in org.foo.example2!", message);
	}
}
