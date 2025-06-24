package org.foo.example2;

import org.foo.example1.MyClass1;

public class MyClass2 {
	public String getMessage() {
		return new MyClass1().getMessage() + " And MyClass2 in org.foo.example2!";
	}
}
