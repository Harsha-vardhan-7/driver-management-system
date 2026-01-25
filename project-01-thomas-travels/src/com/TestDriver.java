package com;

public class TestDriver {

	public static void main(String[] args) {
		
		Travel tr= new Travel();
		
		Driver[] driver = new Driver[5];
		driver[0]= new Driver(1,"Harsha","car", 20000.00);
		driver[1]= new Driver(2,"Vardhan","Lorry", 40000.00);
		driver[2]= new Driver(3,"Dora","Auto", 10000.00);
		driver[3]= new Driver(4,"Srikanth","Car", 23000.00);
		driver[4]= new Driver(5,"Jayam","Car", 290000.00);
		
		Driver driver2= new Driver();
		driver2.setDriverId(1);
		driver2.setDriverName("Hars");
		driver2.setCategory("Car");
		driver2.setTotalDistance(30000.00);
		
		
		
		System.out.println(tr.isCarDriver(driver2));
		
	System.out.println(tr.retrieveByDriverId(driver, 2));
	
	System.out.println(tr.RetriveCountOfDriver(driver, "car"));
	
	String[] namesOfDrivers=tr.retriveDriver(driver, "Car");
	
		if(namesOfDrivers !=null) {
			
			System.out.println(java.util.Arrays.toString(namesOfDrivers));
		}
		
		
		System.out.println(tr.RetriveMaximumDistanceTravelledDriver(driver));
	}

}
