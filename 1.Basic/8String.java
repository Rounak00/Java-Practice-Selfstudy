/*
3 ways to creating string
1. String Class => String s="abcd" / String s=new String("abcd") [those are immutable that cant change]
2. String buffer => StringBuffer s=new StringBuffer("abcd")      [Mutable but Single threated Program]
3. String Builder => StringBuilder s=new StringBuilder("abcd")   [Mutable but not Multi threated program]
 */

 //functions of string
 String s="abcd";

 s.length() => 4
 s.charAt(3) =>d
 s.substring(2,3) =>cd
 s.capitalize() =>Abcd
 s.toUppercase() => ABCD

 //NB for String class if 2 or more variables have same content it will not allocate a new memory
 //ex
 class Test { 
    public static void main(String args[]) 
    {
        // Creating two string literals
        String s1 = "geeks";
        String s2 = "geeks";
        
        // Checking if both point to the
        // same object or not
        if(s1 == s2)
            System.out.println("Yes");
        else
            System.out.println("No");
        
        // Creating a string using 
        // new operator
        String s3 = new String("geeks");
        
        // Checking if both point to the
        // same object or not
        if(s1 == s3)
            System.out.println("Yes");
        else
            System.out.println("No");
    } 
} 



//..........................................Contain()...............................................

class GFG { 
    public static void main(String args[]) 
    {
        // Creating two string literals
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        
        // Whether s2 is present in s1 or not
        // true
        System.out.println(s1.contains(s2));
        
       
    }
} 


// Java program to demonstrate 
// compareTo() method of String in Java
class GFG { 
    public static void main(String args[]) 
    {
        // Creating two string literals
        String s1 = "geeksforgeeks";
        String s2 = "for";
        
        int res = s1.compareTo(s2);
        
        if(res == 0)
            System.out.println("Same");
        
        if(res > 0)
            System.out.println("s1 is Greater");
            
        if(res < 0)
            System.out.println("s1 is Smaller");
    } 
} 





// Java program to demonstrate 
// equals() method of String in Java
class GFG { 
    public static void main(String args[]) 
    {
        // Creating two string literals
        String s1 = "geeksforgeeks";
        String s2 = "geeksforgeeks";
        
        // Whether s2 equal to s1
        System.out.println(s1.equals(s2));
        
      
    } 
} 







// Java program to demonstrate 
// concat() method of String in Java
class GFG { 
    public static void main(String args[]) 
    {
        // Creating two string literals
        String s1 = "geeks";
        String s2 = s1;
        
        // Creates a new object "geeksforgeeks"
        // Now s1 points to this new string
        s1 = s1 + "forgeeks";
        // or
        // s1 = s1.concat("forgeeks");
        
        System.out.println(s1);
        
        // Since s2 is still pointing 
        // to initial "geeks"
        // and s1 is pointing to a new 
        // object "geeksforgeeks"
        System.out.println(s1 == s2);
    }
}







// Java program to demonstrate 
// indexOf() method of String in Java
class GFG { 
    public static void main(String args[]) 
    {
        // Creating two string literals
        String s1 = "geeksforgeeks";
        String s2 = "geeks";
        
        // Returns the first occurrence of
        // s2 in s1 after index 1
        System.out.println(s1.indexOf(s2));
    } 
} 












//..................................................StringBuilder() and StringBuffer().......................................................

//EX1
// Java code to illustrate the internal
// working of String, StringBuilder
// and StringBuffer class 
class GfG
{
    public static void main (String[] args) {
        // String class
        String s1 = "geeks";
        
        // s2 Points to the same location as s1
        String s2 = s1;

        // Creates a new location to store s1
        s1 = s1 + "forgeeks";
        
        // s1 and s2 refers to different location
        if(s1 == s2)
            System.out.println("Same");
        else
            System.out.println("Not Same");

        // StringBuilder or StringBuffer class          
        StringBuilder sb1 = new StringBuilder("geeks");
        
        // sb2 refers to the same location as sb1
        StringBuilder sb2 = sb1;
        
        // Append operation modifies the same object
        // as it is mutable in nature
        sb1 = sb1.append("forgeeks");
        
        // Both sb1 and sb2 refers to the same location
        if(sb1 == sb2)
            System.out.println("Same");
        else
            System.out.println("Not Same");
    }
}
 /*Output
 Not Same
 Same
 */





 //EX2 (All methods of StringBuilder and buffer)
 class GfG
{
    public static void main (String[] args) {
        // StringBuilder or StringBuffer class          
        StringBuilder sb = new StringBuilder("dcba");
        
        // Reversing the StringBuilder
        sb.reverse();
        System.out.println(sb);
        
        // Appending to sb
        sb.append("efg");
        System.out.println(sb);
        
        // Replacing the character at 1
        // with h
        sb.setCharAt(1, 'h');
        System.out.println(sb);
        
        // Delete the characters at 0, 1        
        sb.delete(0, 2);
        System.out.println(sb);
        
        // Inserts "efg" at 1
        sb.insert(1, "efg");
        System.out.println(sb);
    }
}
/*  Outputs
    abcd
    abcdefg
    ahcdefg
    cdefg
    cefgdefg

 */