package javaActivity3;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashArr = new HashSet<Integer>();
		
		//adding data to set
		hashArr.add(5);
		hashArr.add(3);
		hashArr.add(1);
		hashArr.add(9);
		hashArr.add(7);
		//adding duplicate value to set
		hashArr.add(5);

		System.out.println("HashSet :"+hashArr);
		System.out.println("Size of HashSet :"+hashArr.size());

		//Remove one data
		hashArr.remove(3);
		
		if(hashArr.contains(2))
		{
			System.out.println("Remove 2 from the hashset");
			hashArr.remove(Integer.valueOf(2));
		}else
		{
			System.out.println("2 is not available in hashset");
		}
		
		System.out.println("Updated HashSet :"+hashArr);
		


	}

}
