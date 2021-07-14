package AssignmentsWeek1Day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare an int Input and assign a value 13

		// Declare a boolean variable flag as false

		// Iterate from 2 to half of the input

		// Divide the input with each for loop variable and check the remainder

		// Set the flag as true when there is no remainder

		// break the iterator

		// Check the flag (Provide a condition)

		// Print 'Prime' when the condition matches

		// Print 'Not a Prime' when the condition doesn't match
		
		int num=14;
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				
				 flag=true;
				 break;
			}
				
	      }
		
		
		if(flag==false)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
		
	}
	}


