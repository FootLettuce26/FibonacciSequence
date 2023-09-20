package FibonacciSequence;

public class Driver {

	public static void main(String[] args) 
	{
		int count = 25;
		int[] theArray = new int[count];
		System.out.println(Fibonacci(theArray, 7)); //the amount of element, not index
	}
	
	public static int Fibonacci(int[] ar, int index)
	{
		int adder1;
		int adder2;
		ar[0] = 1;
		ar[1] = 1;
		//filling the array
		for(int i = 2; i < ar.length; i++)
		{
			adder1 = ar[i-1]; //the element right before position i
			adder2 = ar[i-2]; //two elements before position i
			ar[i] = adder1 + adder2; //setting i to the sum of the previous 2 elements
			//System.out.println(ar[i]);
			//System.out.println(ar[index]);
		}
		
		int target = ar[index - 1];
		return target;
	}

}
