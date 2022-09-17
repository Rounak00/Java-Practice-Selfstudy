//parameterize
class Point
{
    int x, y;

    Point(int a, int b)
    {
        x = a;
        y = b;
    }

    void print()
    {
        System.out.println("x = " + x + ", y = "+y);
    }
}
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      
      Point p = new Point(10, 20);

      p.print();

    } 
} 



//default
class Point
{
    int x, y;

  
    void print()
    {
        System.out.println("x = " + x + ", y = "+y);
    }
}
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
      
      Point p = new Point();

      p.print();

    } 
} 
