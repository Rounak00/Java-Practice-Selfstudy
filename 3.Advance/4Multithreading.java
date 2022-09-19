//Two ways to create threads -> Extending Thread Class Implementing Runable Interface

//Extend
class Test extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Inside Test Thread");
        }
    }
}

public class Gfg {

   
    public static void main (String[] args)throws InterruptedException {
       
        Test t = new Test();

        t.start();

        for(int i=0; i<5; i++)
        {
            System.out.println("Inside Main Thread");

            Thread.sleep(1);
        }
    }
}

//Interface
class Test implements Runnable
{
    public void run()
    {
        
            System.out.println("In Test Thread");
       
    }
}

public class Gfg {

   
    public static void main (String[] args)throws InterruptedException {
       
        Thread t = new Thread(new Test());

        t.start();

         System.out.println("In Main Thread");
    }
}