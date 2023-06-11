// we can take input in two ways bufferreader and scanner

//BufferReader(it throws a check exceptions and faster than scanner)
import java.io.*; //import input output package
public class Gfg //for string
{ 
    public static void main(String[] args)  
    { 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a String");
       String s = br.readLine();
       System.out.println("You Entered " + s);
    } 
} 


public class Gfg //for integer
{ 
    public static void main(String[] args) 
    { 
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter an Integer");
       int x = Integer.parseInt(br.readLine());
       System.out.println("You Entered " + x);
    } 
} 


//Scanner
import java.io.*;
public class Test
{ 
    public static void main(String[] args) throws IOException 
    { 
       Scanner sc = new Scanner(System.in);

       String s = sc.nextLine();
       System.out.println("You Entered String " + s);

       int x = sc.nextInt();
       System.out.println("You Entered Integer " + x);
       
       float f = sc.nextFloat();
       System.out.println("You Entered Float " + f);
    } 
} 


// ..................................Output..................................

System.out.println(); //print in a new line
System.out.print();  // dont print in a new line
System.out.format();/ System.out.printf(); //print non primitive data types (its convert into sting first)


public class Test
{ 
    public static void main(String[] args)  
    { 
       int x = 10, y = 20;      
       char z = 'G';
       String str = "GFG";
       System.out.println(x);
       System.out.println(x + y);
       System.out.println(x + " " + y);
       System.out.print(str + " ");
       System.out.print("Courses");
    } 
} 

public class Test
{ 
    public static void main(String[] args)throws IOException 
    { 
       int x = 100, y = 200;
       System.out.format("Value of x is %d\n", x);
       float z = (float)Math.PI;
       System.out.println(y);//3.141
       System.out.format("Value of PI = %.2f\n", z); //3.14
       System.out.format("Value of PI = %5.2f\n", z); // 3.14
       System.out.format("Value of PI = %05.2f\n", z); //03.14
       
       System.out.printf("x = %d, y = %d", x, y);
       
    } 
} 

// ..................................................CommandLineArgument............................................................
/*The java command-line argument is an argument i.e. passed at the time of running the java program.
The arguments passed from the console can be received in the java program and it can be used as an input.*/


class CommandLineExample{  
public static void main(String args[]){  
System.out.println("Your first argument is: "+args[0]);  //Your first argument is: sonoo
}  
}  
//compile by > javac CommandLineExample.java  
//run by > java CommandLineExample sonoo  
