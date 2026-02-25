package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Test class to demonstrate functionality of Driver and Travel classes.
 */

public class TestDriver {

	public static void main(String[] args) {

		Travel travel = new Travel();

		List<Driver> driver = new ArrayList<>();
		driver.add(new Driver(1, "Harsha", "car", 20000.00));
		driver.add(new Driver(2, "Vardhan", "Lorry", 40000.00));
		driver.add(new Driver(3, "Dora", "Auto", 10000.00));
		driver.add(new Driver(4, "Nani", "Car", 50000.00));
		driver.add(new Driver(5, "Kamalhasan", "Auto", 20000.00));
		driver.add(new Driver(6, "Rajinikanth", "Auto", 10000.00));
		driver.add(new Driver(7, "Karthik", "Lorry", 1000000.00));

		for (int i = 0; i < driver.size(); i++) {
			System.out.println(travel.isCarDriver(driver.get(i)));
		}

		System.out.println(travel.retrieveByDriverId(driver, 2));

		System.out.println(travel.retrieveCountOfDriver(driver, "Car"));

		System.out.println(travel.retrieveDriver(driver, "Auto"));

		System.out.println(travel.retrieveMaximumDistanceTravelledDriver(driver));
	}

}
