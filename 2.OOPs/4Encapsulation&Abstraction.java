//Encapsulation


public class Test {

   
    public static void main (String[] args) {
       
       Student s1 = new Student();
    	s1.setCGPA(9.7f);
    	
    	System.out.println(s1.getCGPA());
    }
}


class Student
{
	String name;
	private float CGPA;

     static int numberOfStudents;
     
	public float getCGPA(){
		return CGPA;
	}

	public void setCGPA(float newCGPA)
	{
		this.CGPA = newCGPA	;	
	}

	public static int getNumberofStudents()
	{
		return numberOfStudents;
	}
}

//Abstraction
//a Abstract class contain 1 or more abstract methods, abstract class can't intantiated but they can be subclassed
//a Abstract method is a method that is declared without an implimentation(eithout braces and followed by semicolon), like this: abstract void f(int a); 

// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}