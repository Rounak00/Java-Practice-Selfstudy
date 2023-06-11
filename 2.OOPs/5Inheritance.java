/**
*ia-a relation=> what is the type hierarchy of present object?
*has-a relation=> What an objectis made up of?
 */




//ex 1
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Bicycle
{
	public int gear;
	public int speed;

	Bicycle(int gear, int speed)
	{
		this.gear = gear;
		this. speed = speed;
	}

	public void applyBreak(int decrement)
	{
		speed -= decrement;
	}

	public void speedUp(int increment)
	{
		speed += increment;
	}
}

class MountainBike extends Bicycle
{
	public int setHeight;

	public MountainBike(int gear, int speed, int setHeight)
	{
		super(gear,speed);

		this.setHeight = setHeight;
	}

	public void setHeight(int newValue)
	{
		setHeight = newValue;
	}

}
public class Test {

   
    public static void main (String[] args) {
       
    	MountainBike mb = new MountainBike(3, 100, 25);

    	mb.speedUp(20);
    	mb.setHeight(22);
    }
}


//ex2
	/*package whatever //do not write package name here */

	import java.io.*;
	import java.util.*;


	class Bicycle
	{
		public int gear;
		public int speed;

		Bicycle(int gear, int speed)
		{
			this.gear = gear;
			this. speed = speed;
		}

		public void applyBreak(int decrement)
		{
			speed -= decrement;
		}

		public void speedUp(int increment)
		{
			speed += increment;
		}

		public String printInfo()
		{
			return ("No of gears are "+ gear + "\n" + "speed of bicycle is " + speed); 
		}
	}

	class MountainBike extends Bicycle
	{
		public int seatHeight;

		public MountainBike(int gear, int speed, int seatHeight)
		{
			super(gear,speed);

			this.seatHeight = seatHeight;
		}

		public void seatHeight(int newValue)
		{
			seatHeight = newValue;
		}

		public String printInfo()
		{
			return (super.printInfo() + "\n seat height is "+ seatHeight);
		}
	}
	public class Test {

	   
	    public static void main (String[] args) {
	       
	    	MountainBike mb = new MountainBike(3, 100, 25);
			System.out.println(mb.printInfo()+"\n");
	    	
	    	mb.speedUp(20);
	    	System.out.println(mb.printInfo()+"\n");
	    	
	    	mb.seatHeight(22);
	    	System.out.println(mb.printInfo()+"\n");



	    }
	}

//..........................................interface.................................................
//* Interface is same like a Abstract class where all methods by defualt abstract
//t is for multiple inheritance
//ex3
// A simple interface
interface in1
{
    // public, static and final
    final int a = 10;

    // public and abstract 
    void display();
}

// A class that implements the interface.
class testClass implements in1
{
    // Implementing the capabilities of
    // interface.
    public void display()
    {
        System.out.println("Geek");
    }

    // Driver Code
    public static void main (String[] args)
    {
        testClass t = new testClass();
        t.display();
        System.out.println(a);
    }
}
/*Output:
Geek
10*/
