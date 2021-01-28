package javaActivity3;

import java.util.HashMap;

public class Activity3_3 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Pink");
		hm.put(2, "Blue");
		hm.put(3, "Red");
		hm.put(4, "Green");
		hm.put(5, "black");
		
		System.out.println("HashMap :"+hm);
		System.out.println("Remove a color :"+hm.remove(3));
		
		//adding extra data.
		hm.put(3, "Violet");
		
		//trying to remove incorrect data
		System.out.println("Removing invalidate data :"+hm.remove(4, "white"));
		
		System.out.println("HashMap after removing :"+hm);
		
		//containsValue
		System.out.println("verifying Value is avaialble or not :"+hm.containsValue("Green"));
		
		//containsKey
		System.out.println("veriying key :"+hm.containsKey(2));
		
		//Size
		System.out.println("Size of HashMap :"+hm.size());
	
	}

}
