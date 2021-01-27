
package javaActivity2;


interface BicycleParts{
	public static final int gears = 0;
	public static final int speed = 0;
}

interface BicycleOperations{
	public void applyBrake(int decrement);
	
	public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations {
	
	public int speed ;
	public int gears ;
	
	public Bicycle(int gears, int speed) {
		
	}

	@Override
	public void applyBrake(int decrement) {
		//System.out.println("Apply Brake");
		speed -= decrement;
		System.out.println("Speed reduced to "+speed);
		
	}

	@Override
	public void speedUp(int increment) {
		//System.out.println("Speed Up");	
		speed += increment;
		System.out.println("Speed increased to "+speed);
	}
	
	public String bicycleDesc() {
		return ("No of gears :"+gears +"\n"+"Speed of bycycle :"+speed);
	}
}

class MountainBike extends Bicycle{
	
	int seatHeight;
	
	public MountainBike(int gears, int speed, int seatHeight) {
		//Invoking base-class(Bicycle) constructor
		super(gears,speed);
	}
	
	public void setHeight(int newSeatHeight) {
		seatHeight = newSeatHeight;
	}
	
	@Override
	public String bicycleDesc() {
		return (super.bicycleDesc()+"\n"+"Seat height :"+seatHeight);
	}
	
	
}

//Main Class
public class Activity2_3 {
	
	//Main Method
	public static void main(String[] args) {
		
		MountainBike mb = new MountainBike(3,100,10);
		
		System.out.print(mb.bicycleDesc());
		mb.speedUp(30);
		mb.applyBrake(10);
		

	}

}
