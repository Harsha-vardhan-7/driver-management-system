package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Test class to demonstrate functionality of Driver and Travel classes.
 */

public class TestDriver {

	public static void main(String[] args) {

		Travel travel = new Travel();

		List<Driver> drivers = new ArrayList<>();
		drivers.add(new Driver(1, "Harsha", "car", 20000.00));
		drivers.add(new Driver(2, "Vardhan", "Lorry", 40000.00));
		drivers.add(new Driver(3, "Dora", "Auto", 100000.00));
		drivers.add(new Driver(4, "Nani", "Car", 50000.00));
		drivers.add(new Driver(5, "Kamalhasan", "Auto", 20000.00));
		drivers.add(new Driver(6, "Rajinikanth", "Auto", 10000.00));
		drivers.add(new Driver(7, "Karthik", "Lorry", 1000000.00));


		drivers.forEach(driver-> System.out.println(travel.isCarDriver(driver)));
		
		System.out.println(travel.retrieveByDriverId(drivers, 1));

		System.out.println(travel.retrieveCountOfDriver(drivers, "Auto"));

		System.out.println(travel.retrieveDriver(drivers, "Auto"));

		System.out.println(travel.retrieveMaximumDistanceTravelledDriver(drivers));
	}

}
