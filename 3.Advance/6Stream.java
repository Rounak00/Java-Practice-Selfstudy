//EX
class GFG {
  
	public static void main (String[] args) {
	
	 List<Integer> l= Arrays.asList(5,10,20,30,8,7);
	 
	 l.stream().filter(x -> x%2==0).filter(x -> x > 10).forEach(System.out::println);
	 

	}
	
}


//Method Refference
class GFG {
   
	public static void main (String[] args) {
	
	String a[] = {"GFG","IDE","Courses"};
	String b[] = {"gfg","ide","courses"};
	
	if(Arrays.equals(a,b,(x1,x2)->x1.compareToIgnoreCase(x2)))
	    System.out.println("Yes");
	
	else
	    System.out.println("No");
	
	}
	
}


//Sum of array
  
	public static void main (String[] args) {
	
	 int arr[]={30,20,10};
	 
	 int sum=Arrays.stream(arr).sum();
	 
	 System.out.println(sum);
	 

	}
	
}


//First 10 numbers which contain 5
class GFG {
  
	public static void main (String[] args) {
	
	 Stream.iterate(1, x -> x + 1)
	 .filter(x -> x.toString().contains("5"))
	 .limit(10)
	 .forEach(System.out::println);

	}
	
}



//Max in an array
class GFG {
  
	public static void main (String[] args) {
	
	 int arr[]={30,20,10};
	 
	 int max=Arrays.stream(arr).max().getAsInt();
	 
	 System.out.println(max);
	 

	}
	
}