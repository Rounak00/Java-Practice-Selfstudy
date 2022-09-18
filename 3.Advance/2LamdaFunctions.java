//Example code
import java.io.*;
import java.util.*;
import java.util.function.*;

class GFG {
    static void printCond(Collection<Integer> C, Predicate<Integer> p)
    {
        for(Integer x: C)
        {
            if(p.test(x))
                System.out.print(x+" ");
        }
    }
	public static void main (String[] args) {
		
		class MyPredicateEven implements Predicate<Integer> {
		    
		    public boolean test(Integer x)
		    {
		        return x%2==0;
		    }
		}
		List<Integer> al= new ArrayList<>(Arrays.asList(10,5,20,7,30));
		
		printCond(al,new MyPredicateEven());
	}
}

//using lamda
class GFG {
    static void printCond(Collection<Integer> C, Predicate<Integer> p)
    {
        for(Integer x: C)
        {
            if(p.test(x))
                System.out.print(x+" ");
        }
    }
	public static void main (String[] args) {
	
		List<Integer> al= new ArrayList<>(Arrays.asList(10,5,20,7,30));
		
		printCond(al, x -> x % 2 == 0 );
	}
}



//.............................................Types........................................
//Without parameter

interface Test
{
    void print();
}



class GFG {
   
    static void fun(Test t)
	{
	    t.print();
	}
	
	public static void main (String[] args) {
	
	    
	    fun(() -> System.out.println("Hello"));
	
	}
	
}


//Multi parameter
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.function.*;


interface Test3
{
    void print(Integer p1, Integer p2);
}



class GFG {
   
    static void fun(Test3 t, Integer p1, Integer p2)
	{
	    t.print(p1,p2);
	}
	
	public static void main (String[] args) {
	
	    
	    fun((p1,p2) -> System.out.println(p1+" "+p2), 10,20);
	
	}
	
}




//Single parameter
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.function.*;


interface Test
{
    void print(Integer p);
}



class GFG {
   
    static void fun(Test t, Integer p)
	{
	    t.print(p);
	}
	
	public static void main (String[] args) {
	
	    
	    fun(p -> System.out.println(p), 10);
	
	}
	
}