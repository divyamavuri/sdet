/*Add a Class named Activity2.
In the main() method:
Initialize an array with 6 number: [10, 77, 10, 54, -11, 10]
Find the 10's in the array and add them
Check if value is equal to 30.*/


package javaActivity1;

import java.util.Arrays;

public class Activity2 {

	//Main method
	public static void main(String[] args) {
 
		//initialize data.
		int[] arrNum= {10, 77, 10, 54, -11, 10};
		
		System.out.println("Array of Number :"+Arrays.toString(arrNum));
		
		//result method in same class validates
		result(arrNum,10,30);
		System.out.println("RESULT :"+result(arrNum,10,30));
	}
	
	//SubMethod
	public static boolean result(int[] numbers, int searchNum, int expectedSumOfNumbers)
	{
		boolean result = false;
		int tempSum = 0;
		for(int number : numbers)
		{
			//To Find the 10's in the array
			if(number ==searchNum)
			{
				// To add all 10s
				tempSum += searchNum;
			}
			
			//To verify sum is 30
			if(tempSum >= expectedSumOfNumbers)
				break;
					
			result = true;
		}
		return result;
	}

}
