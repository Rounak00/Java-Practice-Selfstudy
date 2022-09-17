
//Compile Time Polymorphism or Method Overloading


/*
Early binding or Compile time polymorphism can be achieved by resolving the methods. The compiler resolves which method should be used based on the signature and number of parameters at compile time only.
Method overloading increases the readability and maintainability of the Java Program as we don't need to write separate method names performing same operations on different numbers or types of arguments.

=> Method Overloading: Changing number of Parameters
*/


class Addition
{
    static int sum(int a, int b)
    {
       return (a+b);
    }
    static int sum(int a, int b, int c)
    {
       return (a+b+c);
    }

}

class Test
{
    
    public static void main(String[] args)
    {
        //Don't need to create objects
        //We have defined sum Method as static
        System.out.println(Addition.sum(5,5));
        System.out.println(Addition.sum(5,5,5));
    }
    
}
/*Output:
10
15*/

/*=> Method Overloading: Changing data type of Parameters */



class Addition
{
    static int sum(int a, int b)
    {
       return (a+b);
    }
    static double sum(double a, double b)
    {
       return (a+b);
    }

}

class Test
{
    
    public static void main(String[] args)
    {
        //Don't need to create objects
        //We have defined sum Method as static
        System.out.println(Addition.sum(5,5));
        System.out.println(Addition.sum(5.2,5.5));
    }
    
}
/*Output:
10
10.7*/

/*=> Why method overloading is not possible by changing the return type of method only?

If we only change the return type, then method overloading cannot happen because there will be ambiguity between the methods having the same number and data type of parameters. Let's have a look at an example,*/


class Addition
{
    static int sum(int a, int b)
    {
       return (a+b);
    }
    static double sum(int a, int b)
    {
       return (a+b);
    }

}

class Test
{
    
    public static void main(String[] args)
    {
        //Don't need to create objects
        //We have defined sum Method as static
        System.out.println(Addition.sum(5,5)); 
       // Ambiguity which method to invoke !!
    }
    
}
/*Output:
Compile Time Error: method sum(int, int) is already defined in class Addition*/



/*=> Can we Overload Java main() method?

Yes, We can write many main methods with different signatures but JVM invokes only the main method which receives String Array as an argument. Let's have a look at an example.*/



class Test
{
    
    public static void main(String[] args)
    {
        System.out.println("Main method with String [ ] arguments");
    }
    public static void main(String args)
    {
        System.out.println("Main method with String argument");
    }
    public static void main()
    {
        System.out.println("Main method with no argument");
    }
    
}
/*Output:
Main method with String [ ] arguments*/
















//.....................................................................................................................................................
/* Run time Polymorphism or Method Overriding


In method overriding actual method is resolved at run time. When we have the same name method in Parent and Children class, then this conflict is resolved at the run time.
Method overriding is used to provide a specific implementation of a method that is already provided by its superclass.
Two rules must be followed to override the method:
Methods in parent and children class must have the same name.
Methods in parent and children class must have the same signature(data type, number of parameters).


=> Real-World Example of Method Overriding

There are several types of employees in the Company and they are having different bonuses based on their designation, Let's see how this can be implemented through method overriding.*/



class Employee
{
    int bonus()
    {
       return 500;
    }

}

class Programmer extends Employee
{
    
    int bonus()
    {
       return 1000;
    }
    
}

class Manager extends Employee
{
    
    int bonus()
    {
       return 2000;
    }
    
}
class Test 
{
    public static void main(String [] args)
    {
         Programmer p = new Programmer();
         Manager m = new Manager();
         System.out.println("Programmer's Bonus : "+ p.bonus());
         System.out.println("Manager's Bonus : "+ m.bonus());
    }
}
 
/*Output:
Programmer's Bonus: 1000
Manager's Bonus: 2000*/


/*
Can we override static method?

We can not override the static method because static methods do not belong to objects, it resides in the Class memory area and We can not override class methods as they are shared among all the objects.
Can we override the main method?

We can not override the main method because main is a static method.
*/