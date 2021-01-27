package javaActivity1;

public class Activity1 {

	public static void main(String[] args) {
		
		//Created a new obj for car which is in same package.
		Car toyoto = new Car();
		
		//Assigning values
		toyoto.make = 2014;
		toyoto.color = "Black";
		toyoto.transmission = "Manual";
		
		//calling methods
		toyoto.displayCharacteristics();
		toyoto.accelarate();
		toyoto.brake();
		
		
	}

}
