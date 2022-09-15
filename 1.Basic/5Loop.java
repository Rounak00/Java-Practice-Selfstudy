//for loop
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
        for(int i=0; i<10; i++) //for(;true;) => infinite loop
        {
            System.out.println("GFG");
        }

    } 
} 

//while
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
       int i =0;
       
       while(i<10) //while(true) =>infinite loop
       {
           System.out.println("GFG");
           i++;
       }

    } 
} 

//Do-While
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
       int i =0;
       
       do
       {
           System.out.println("GFG"); 
           i++; 
       }while(i<10);

    } 
} 

//Break -  Continue
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      for(int i=0; i<11; i++)
      {
          if(i%3==0)
          {
              continue;
          }
          if(i==10)
          {
            break;
          }
          System.out.println(i);
      }

    } 
} 