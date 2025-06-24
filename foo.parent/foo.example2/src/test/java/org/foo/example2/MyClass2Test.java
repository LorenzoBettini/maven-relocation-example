package org.foo.example2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple MyClass2.
 */
public class MyClass2Test {
	@Test
	public void testGetMessage() {
		MyClass2 myClass1 = new MyClass2();
		String message = myClass1.getMessage();
		assertEquals("Hello from MyClass1 in org.foo.example1! And MyClass2 in org.foo.example2!", message);
	}
}
