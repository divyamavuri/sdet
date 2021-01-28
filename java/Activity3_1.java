package javaActivity3;

import java.util.ArrayList;
import java.util.List;

public class Activity3_1 {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<String>();
		
		myList.add("Divya");
		myList.add("Sowji");
		myList.add("Mani");
		myList.add("Siva");
		myList.add(2,"Ravi");
		
		for(int i=0; i<myList.size();i++)
		{
			System.out.println(myList.get(i));
		}
		
		System.out.println("3rd name "+myList.get(2));
		
		System.out.println("List Contains Name Sowji :"+myList.contains("Sowji"));
		System.out.println("Size of List :"+myList.size());
		
		//Remove a name.
		myList.remove(String.valueOf("Divya"));
		
		//Size after removing a value.
		System.out.println("Size after removing a name :"+ myList.size());
	}

}
