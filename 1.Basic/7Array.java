//array
class Main {
    public static void main(String[] args){
        int[] a={10,20,30,40};
        /*
        we can also do this
        int []a;
        a=new int[3];
         */
        System.out.println(a.length);//4
        a[2]=50;
        System.out.println(a[2]);//30
        System.out.println(a[1]);//20
    }
}
//Array index out of bound throw this exception when array is full


/*
NB::
int []a, b; => here a is only array and b is integer
int a[], b; => here only a and b both are array
 */


 //.................................................................Multidimentional array..........................................
 /*
 A jagged array is an array of arrays such that member arrays can be of different sizes, i.e., we can create a 2-D array but with a variable number of columns in each row. These types of arrays are also known as Jagged arrays. 
  */
 class GFG 
{ 

	public static void main(String args[]) 
    {
    	int arr[][] = {{1, 2, 3, 8, 9},
    				   {4, 5, 6}};

    	for(int i = 0; i < arr.length; i++)
    	{
    		for(int j = 0; j < arr[i].length; j++)
    		{
    			System.out.print(arr[i][j] + " ");
    		}
    	}
    } 

}