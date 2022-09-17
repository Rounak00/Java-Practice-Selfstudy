import java.math.*;
import java.io.*;
import java.util.*;

class Complex
{
    int real, imag;

    void print()
    {
        System.out.println(real + " +i"+ imag);
    }

    Complex(int r, int i)
    {
        real = r;
        imag = i;
    }

    void add(Complex C)
    {
        real += C.real;
        imag += C.imag; 
    }
}
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      Complex c1 = new Complex(10, 20);
      c1.print();
      Complex c2 = new Complex(20, 30);
      c1.add(c2);
      c1.print();   
    } 
} 


//..............................................AccessSpecifier............................................................
Private protected public default.... here the problem is about default which is new in java. its same like public but its can help you to run obbject only of that package;

//................................................This.....................................................................
class Point
{
    int x, y;

    Point(int x, int y)
    {
        this.x = y;
        this.y = y;
    }

    void print()
    {
        System.out.println(x+" "+y);
    }
}
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      
      Point p1 = new Point(10, 20);
      
      Point p2 = new Point(5, 15);

     

    } 
} 


//.................................................Static Member.........................................................
import java.math.*;
import java.io.*;
import java.util.*;

class Player
{
    String name;
    int id;

    static int playerCount = 0;

    Player(String name)
    {
        this.name = name;
        id= ++playerCount;
    }

    void printDetails()
    {
        System.out.println(id+":"+name);
    }
}
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      Player p1 = new Player("xyz");
      Player p2 = new Player("abc");

      p1.printDetails();
      p2.printDetails();
    } 
} 



//static methhods
public class GFG {
    // static variable
    static int a = 40;
  
    // instance variable
    int b = 50;
  
    void simpleDisplay()
    {
        System.out.println(a);
        System.out.println(b);
    }
  
    // Declaration of a static method.
    static void staticDisplay()
    { 
      System.out.println(a); 
    }
  
    // main method
    public static void main(String[] args)
    {
        GFG obj = new GFG();
        obj.simpleDisplay();
  
        // Calling static method.
        staticDisplay();
    }}