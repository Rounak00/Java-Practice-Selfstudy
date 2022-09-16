public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
     int x = 5, y = 10;
     
     System.out.println(getMax(x, y));
    } 
    
    public static int getMax(int x, int y)
    {
        if(x > y)
        return x;
        
        else
        return y;
    }
    
    
} 


//nonprimitive
// EX1=>
class Point 
{
    int x;
    int y;
}
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
     
        Point p = new Point();
        
        p.x = 5; p.y = 10;
        
        fun(p);
        
        System.out.println(p.x +" "+ p.y); //10 10
    } 
    
    public static void fun(Point p)
    {
        p.x = 10; p.y = 10;
    }
    
    
} 

//EX2=>
class Point 
{
    int x;
    int y;
}
public class Gfg
{ 
    public static void main(String[] args)throws IOException 
    { 
     
        Point p = new Point();
        
        p.x = 5; p.y = 10;
        
        fun(p);
        
        System.out.println(p.x +" "+ p.y);//5 10
    } 
    
    public static void fun(Point p)
    {
        p = new Point();
        
        p.x = 10; p.y = 10;
    }
    
    
} 