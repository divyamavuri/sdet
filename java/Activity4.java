package javaActivity1;

import java.util.Arrays;

public class Activity4 {

	//Main Method
	public static void main(String[] args) {
		//initialize data
		int[] data = { 8, 6, 5,0,1, 4, 3 };
		
		//get size.
		int size = data.length;
		for (int i= 1; i<size; i++)
		{
			int num = data[i];
			int j= i-1;
			while (j>=0 && num<data[j])
			{
				data[j+1] = data[j];
				j--;
			}
			data[j+1] = num;
		}

		System.out.println("Sorted data in ascending order");
		System.out.println("Sorted array :"+Arrays.toString(data));

	}


}
