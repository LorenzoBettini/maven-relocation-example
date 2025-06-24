package org.foo.example1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple MyClass1.
 */
public class MyClass1Test {
	@Test
	public void testGetMessage() {
		MyClass1 myClass1 = new MyClass1();
		String message = myClass1.getMessage();
		assertEquals("Hello from MyClass1 in org.foo.example1!", message);
	}
}
