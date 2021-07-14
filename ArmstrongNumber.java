package AssignmentsWeek1Day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare your input

		

		

		// Declare 3 more int variables as calculated, remainder, original (Tip:
		// Initialize calculated alone)

		// Assign input into variable original

		// Use loop to calculate: use while loop to set condition until the number
		// greater than 0

		// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

		// Within loop: get the quotient when done by 10 (Tip: Assign the result to
		// input)

		// Within loop: Add calculated with the cube of remainder & assign it to
		// calculated

		// Check whether calculated and original are same

		// When it matches print it as Armstrong number
		
		int remainder,original,n=153;
		double calculated = 0;
		original=n;
		while(original>0)
		{
			remainder=original%10;
			calculated=calculated+Math.pow(remainder, 3);
			original=original/10;
			
			
		}
		if(calculated==n)
		{
			System.out.println("Armstrong");
		}
		
	}

}
