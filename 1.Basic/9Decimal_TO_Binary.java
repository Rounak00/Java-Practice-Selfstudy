//Decimal to binary
// Java program to convert a decimal number to binary number 
import java.io.*; 
class GFG 
{ 
	// function to convert decimal to binary 
	static void decToBinary(int n) 
	{ 
		// array to store binary number 
		int[] binaryNum = new int[1000]; 

		// counter for binary array 
		int i = 0; 
		while (n > 0) 
		{ 
			// storing remainder in binary array 
			binaryNum[i] = n % 2; 
			n = n / 2; 
			i++; 
		} 

		// printing binary array in reverse order 
		for (int j = i - 1; j >= 0; j--) 
			System.out.print(binaryNum[j]); 
	} 
	
	public static void main (String[] args) 
	{ 
		int n = 17; 
		System.out.println("Decimal - " + n); 
		System.out.print("Binary - "); 
		decToBinary(n); 
	} 
} 




//Binary to decimal
import java.util.Scanner;

class GFG
{
    public static void binToDec(String s)
    {
        int m = 0;
        int k = 1;
        for(int i = s.length() - 1; i >= 0; i--){
        m += (s.charAt(i) - '0') * k;
        k = k * 2;
    }
        System.out.println(m);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        binToDec(s);
    }
}
