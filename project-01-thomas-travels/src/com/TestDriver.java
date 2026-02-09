package com;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		
		Travel tr= new Travel();
		
		ArrayList <Driver> driver= new ArrayList<>();
		driver.add(new Driver (1,"Harsha","car", 20000.00));
		driver.add(new Driver(2,"Vardhan","Lorry", 40000.00));
		driver.add(new Driver(3,"Dora","Auto", 10000.00));
		driver.add(new Driver(4,"Nani","Car", 50000.00));
		driver.add(new Driver(5,"Kamalhasan","Auto", 20000.00));
		driver.add(new Driver(6,"Rajinikanth","Auto", 10000.00));
		driver.add(new Driver(7,"Karthik","Lorry", 1000000.00));
		
		
		for (int i=0; i<driver.size(); i++) {
			System.out.println(tr.isCarDriver(driver.get(i)));
		}
		
		
	System.out.println(tr.retriveByDriverId(driver, 2));
		
	System.out.println(	tr.retriveCountOfDriver(driver, "Car"));
		
	System.out.println(tr.retriveDriver(driver, "Auto"));
		
	System.out.println(tr.retriveMaximumDistanceTravelledDriver(driver));
	}

}
