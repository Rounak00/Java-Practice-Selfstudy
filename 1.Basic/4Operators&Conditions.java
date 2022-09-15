//Operators
//arithmatic operators
public class Test
{ 
    public static void main(String[] args) throws IOException 
    { 
        int x = 10, y = 20;
        System.out.println(x + y); //30
        System.out.println(x * y);     //200 
        System.out.println(y / x);     //2 
        int z = (x + y * 10);   
        System.out.println(z);//210
        z = x++;
        System.out.println(z + " " + x); //10 11
        z = ++x;
        System.out.println(z + " " + x); //12 12
      
    } 
} 
//Logical Operators
public class Test
{ 
    public static void main(String[] args)throws IOException 
    { 
        boolean x = true, y = false;      
        System.out.println(x && y);      
        System.out.println(x || y);       
        System.out.println( !x );      
    } 
}
//Assignment operator
public class Test
{ 
    public static void main(String[] args) throws IOException 
    { 
        int x = 10, y = 5, z; 
        x += y;      
        System.out.println(x);      
        x %= y;      
        System.out.println(x);       
        z = x = y;      
        System.out.println(z);
    } 
} 
// ...................................................Conditional statements..............................................
//if-else
public class Test
{ 
    public static void main(String[] args)throws IOException 
    { 
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Please Enter a Number");
       
       int n= sc.nextInt();
       
      if( n > 0 )
      {
          System.out.print("Positive ");
          
          
          if(n%2==0)
          System.out.print("Even\n");
          
          else
          System.out.print("Odd\n");
      }
      else if( n < 0 )
      {
          System.out.print("Negative ");
          
          
          if(n%2==0)
          System.out.print("Even\n");
          
          else
          System.out.print("Odd\n");
      }
      else
      {
          System.out.print("Zero");
      }
       
    } 
}

//Switch
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      int x = 0, y = 0;

      System.out.println("Enter a move");
      Scanner sc = new Scanner(System.in);
      char move = sc.next().charAt(0);

      switch(move)
      {
            case 'L': x--; break;
            case 'R': x++; break;
            case 'U': y++; break;
            case 'D': y--; break;

            default: System.out.println("Invalid");
      }
      System.out.println(x+" "+y);
    } 
} 