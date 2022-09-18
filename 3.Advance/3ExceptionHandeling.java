/*
Hirerchy of exceptions

object -> Throwable -a-> Error -> StackOverFlowError,VirtualMAchineError,OutOfMemoryError
                    -b-> Exceptions -1-> Runtime Exceptions(unchecked) ->ArithmaticException, NullPOinterException, IndexOutOfBoundException
                                    -2-> CompileTime exceptions(Checked) -> IOException, SQLException, ClassNotFoundException, FileNotFoundException
 */


 //Keywords use in exception handelling -> try, catch, finally, throw, throws

 //Simple exception handeling exxamples
 //ex1

class Test {
  
    public static void main (String[] args) {
    
        try{
                Scanner sc = new Scanner(new File("test.in"));


                System.out.println("Exit main()");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not Found caught");
        }
        finally{

                System.out.println("finally-block runs regardless of the state of exception");
        }
    }
}

//ex2
class Test {
  
    public static void main (String[] args) {
    
        try{
                Scanner sc = new Scanner(new File("test.in"));


                System.out.println("Exit main()");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File not Found caught");
        }
        finally{

                System.out.println("finally-block runs regardless of the state of exception");
        }
        
        System.out.println("After try-catch-finally, life goes on");
    }
}


//Ex 3
class Test {
  
    public static void main (String[] args) {
    
       int a, b, sum;

       try{
            a=Integer.parseInt(args[0]);
            b=Integer.parseInt(args[1]);
            sum=a+b;

            System.out.println("Addition is "+sum);
       }
       catch(ArrayIndexOutOfBoundsException e){

            System.out.println("Insufficient nos.");
       }
    }
}


//Exception handelling ccallSatck
//EX 1
class Test {
   
    public static void main (String[] args) {
    
        try{
                methodA();

                 System.out.println("Exit main()");

           }
           catch(ArithmeticException ex)
           {
                 System.out.println("ArithmeticException caught ...");

                 ex.printStackTrace();
           }
    }

     static void methodA()
    {
        System.out.println("Enter methodA()");
        try{
        int a = 5, b = 0;

        int c = a / b;

        System.out.println(c);
    }
    finally{

            System.out.println("finally in methodA()");
    }
         System.out.println("Exit methodA()");
    }
}


//EX 2
class Test {
   
    public static void main (String[] args) {
    
        try{
                methodA();

                 System.out.println("Exit main()");

           }
           catch(ArithmeticException ex)
           {
                 System.out.println("ArithmeticException caught ...");

                 ex.printStackTrace();
           }
    }

     static void methodA()
    {
        System.out.println("Enter methodA()");

        int a = 5, b = 0;

        int c = a / b;

        System.out.println(c);

         
    }
}


//Throw and Throws
class ExceptionDemo{
   
    public static void main (String[] args) {
    
        try{
                methodA();

                 System.out.println("Exit TRY of main()");

           }
           catch(ArithmeticException ex)
           {
                 System.out.println("ArithmeticException caught ...");

                 ex.printStackTrace();
           }

           System.out.println("Exit main() successfully");
    }

     static void methodA()throws ArithmeticException
    {

        

        Scanner in = new Scanner(System.in);

        int a = 5, b = 0, c;
        
        System.out.println("Enter numeric value for variable b");
        
        b = in.nextInt();

        if(b==0)
            throw new ArithmeticException();
        else
            c = a / b;

        System.out.println("Exit methodA()");
    }
}


//Multi exceptions
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class ExceptionDemo{
   
    public static void main (String[] args) {
    
        try{
                methodA();

                Scanner in = new Scanner(new File("test.in"));

                 System.out.println("Exit main()");

           }
           catch(ArithmeticException ex)
           {
                 System.out.println("ArithmeticException caught ...");
           }
           catch(FileNotFoundException ex)
           {
                 System.out.println("File Not Found Exception caught ...");
           }
           catch(Exception ex)
           {
                 System.out.println("A new type of Exception caught ...");
           }
           finally
           {
                System.out.println("finally-block runs regardless of the state of exception");
           }

           System.out.println("After try-catch-finally, life goes on...");
    }

     static void methodA()throws ArithmeticException
    {

        

        Scanner in = new Scanner(System.in);

        int a = 5, b = 0, c;
        
        System.out.println("Enter numeric value for variable b");

         b = in.nextInt();

        if(b==0)
            throw new ArithmeticException();
        else
            c = a / b;

        System.out.println("Exit methodA()");
    } 
}



//UserDefined Exceptions
//EX1
class InvalidBalanceException extends Exception
{
    public InvalidBalanceException(String message)
    {
        super(message);
    }
}
class ExceptionDemo{
   
    public static void main (String[] args){
    
        int balance;

        balance = Integer.parseInt(args[0]);
        updateBalance(balance);
       
    }

    public static void updateBalance(int number)throws InvalidBalanceException
    {
            if(number < 0)
            {
                throw (new InvalidBalanceException("Account balance cannot be less than Zero."));
            }

            System.out.println("No exception occured in updateBalance() method");
    }
    
}

//EX2
class InvalidBalanceException extends Exception
{
    public InvalidBalanceException(String message)
    {
        super(message);
    }
}
class ExceptionDemo{
   
    public static void main (String[] args) {
    
        int balance;
        try
        {
        balance = Integer.parseInt(args[0]);
        updateBalance(balance);
        }
        catch(InvalidBalanceException ex)
        {
            System.out.println("Caught in catch of InvalidBalanceException");
            ex.printStackTrace();
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Caught in catch of NumberFormatException");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Caught in catch of ArrayIndexOutOfBoundsException");
        }
        catch(Exception ex)
        {
            System.out.println("Caught in catch of Parent Exception");
        }
        
         System.out.println("Main method executed successfully");
        
    }

    public static void updateBalance(int number)throws InvalidBalanceException
    {
            if(number < 0)
            {
                throw (new InvalidBalanceException("Account balance cannot be less than Zero."));
            }

            System.out.println("No exception occured in updateBalance() method");
    }
    
}