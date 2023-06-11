//Variable
/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		final int x;
		
		x = 100;
		
		System.out.println(x);
	}
}
//Class Final variable
/*package whatever //do not write package name here */

import java.io.*;

class Test {
    
   static final int MAX = 100;
    
	public static void main (String[] args) {
		
		
		
		System.out.println(MAX);
	}
}
//Instance Final variable

import java.io.*;

class Test {
    
    final int x = 100;
    
	public static void main (String[] args) {
		
		Test t =  new Test();
		
		System.out.println(t.x);
	}
}
//Final refference variable
/*package whatever //do not write package name here */

import java.io.*;

class Test {
    
    
	public static void main (String[] args) {
		
		final StringBuffer sb = new StringBuffer("Geeks");
		
		sb.append("forGeeks");
		
		System.out.println(sb);
	}
}



/*
 * Final Variable = Non Mutable
 * Final Method = Non Overridden
 * Final Class = Non inheritable
 */