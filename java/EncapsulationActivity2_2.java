package javaActivity2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane
{
	private int maxPassengers;
	private List<String> passengers; 
	private Date lastTimeTakeOff;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers)
	{
		this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
	}
	
	public void onBoard(String passenger)
	{
		this.passengers.add(passenger);
	}
	
	public Date takeOff()
	{
		this.lastTimeTakeOff = new Date(); 
		return lastTimeTakeOff;
	}
	
	public void land() {
		this.lastTimeLanded = new Date();
		 this.passengers.clear();
		
	}
	
	public Date getLastTimeLanded() {
		this.lastTimeLanded = new Date();
		return lastTimeLanded;
	}
	
	public List<String> getPassengers(){
		return passengers;
	}
}


public class EncapsulationActivity2_2 {

	public static void main(String[] args) throws InterruptedException {
		
		//max 10 mem
		Plane plane = new Plane(10);
		
		//Passengers adding
		plane.onBoard("Divya");
		plane.onBoard("Sowji");
		plane.onBoard("Mani");
		
		//Plane take off
		System.out.println("TakeOff Time : "+plane.takeOff());
		
		//List of passengers in plane.
		System.out.println("List Of Passengers : "+ plane.getPassengers());
		
		//Fly
		Thread.sleep(5000);
		
		//Plane landed
		plane.land();
		
		//
		System.out.println("Land Time : "+plane.getLastTimeLanded());
	}

}
