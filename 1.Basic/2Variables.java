//int float byte short long double char boolean etc ->premitive data type
//class -> non primitive

//now if we use final key word it makes variable nonchangeable-noninheritable-nonoverridable
ex-> 
public class Main {
    public static void main(String[] args) {
        final int a=5;
        System.out.println(a); //5
        a=2; //error happened
    }
}


//NB: print primitive data types without value it gives error 


//..................................................Wrapper Class........................................
// The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive. ex: Character  byte, Short, Integer, Long, Float,Double, Boolean

public class Main {
    public static void main(String[] args) {
        Integer a=new Integer(10);
        System.out.println(a);
     
    }
}

//ex2

public class Main {
    public static void main(String[] args) {
        Integer a=new Integer(10);
        Integer b=new Integer(10);
        return a==b; //here return will be false
     
    }
}

//.....................................................Autoboxing&Unboxing.............................
public class Main{
 public static void main(String[] args){
    int a=10;
    Integer b=a; //Auto-boxing (premitive change to object literals)
    int c=b; // Auto-unboxing (reverse of that)
 }
};

//.........................................Type conversion........................................
public class Main{
    public static main(String[] args){
        double a =1024.45;
        int i=(int)a;
    }
}