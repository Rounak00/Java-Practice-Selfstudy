/* Initialize
BigInteger a= new BigInteger("50");

String val="457";
BigInteger b=new BigInteger(val);

int val=5478;
BigInteger c=BigInteger.valueOf(val);

 */

/* BigInteger Functions

BigInteger A=new BigInteger("1004");
BigInteger B=new BigInteger("1000");

A.multiply(B);
A.add(B);
A.reminder(B);
A.subtract(B);
A.divide(B);
A.compareTo(B); // if(a>b){-1} if(a<b){0} if(a==b){1}
A.intValue(); //convert value in int
A.longValue();
a.toString();
 */

//Factorial

// Driver class with main function
class Main {

    public static BigInteger factorial(int a){
        BigInteger f=new BigInteger("1");
        for(int i=2;i<=a;i++){
            BigInteger x=BigInteger.valueOf(i);
            f=f.multiply(x);
        }
        return f;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        while(testcase-- > 0){
            //Taking input a
            int a = sc.nextInt();

            System.out.println(factorial(a));
        }
    }
}

//Fibbonacci
import java.math.BigInteger;
import java.util.Scanner;

// Driver class with main function
class Gfg {

    public static BigInteger fib(int n){
        BigInteger a=BigInteger.valueOf(0);
        BigInteger b=BigInteger.valueOf(1);
        BigInteger c=BigInteger.valueOf(1);
        for(int j=2;j<=n;j++){
            c=a.add(b);
            a=b;
            b=c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            //Taking input n
            int n = sc.nextInt();

            System.out.println(fib(n));
        }
    }
}




//Prime

import java.util.Scanner;
import java.math.BigInteger;

class GFG{
    
    public static boolean isPrime(int n){
        BigInteger b = BigInteger.valueOf(n);
        return b.isProbablePrime(n);
    }
    
    public static int isProbablePrime(int n){
        BigInteger b = BigInteger.valueOf(n);
        String s = b.nextProbablePrime().toString();
        
        return Integer.parseInt(s);
    }
    
    public static void main (String[] args) {
        Scanner ob = new Scanner(System.in);
        int n = ob.nextInt();
        System.out.println(isPrime(n));
        System.out.println(isProbablePrime(n));
    }
}