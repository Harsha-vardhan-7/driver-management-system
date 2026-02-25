package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Travel service class responsible for performing business operations on Driver objects.
 */
public class Travel {

	// Method 1: Checks whether a given driver belongs to "Car" category
	// =====================
	public boolean isCarDriver(Driver driver) {
		if (driver != null && 
				driver.getCategory() != null && 
				driver.getCategory().equalsIgnoreCase("car")) {
			return true;
		}
		return false;
	}

	// Method 2 =====================
	/**
	 * Retrieves driver details based on driver ID. 
	 * Returns formatted string if found, otherwise returns "Driver not found".
	 */
	public String retrieveByDriverId(List<Driver> driver, int driverID) {
		for (int i = 0; i < driver.size(); i++) {
			if (driver.get(i) != null && driver.get(i).getDriverId() == driverID) {
				return "Driver name is " + driver.get(i).getDriverName() + " Belongingto the category"
						+ driver.get(i).getCategory() + "traveled" + driver.get(i).getTotalDistance() + " KM so far.";
			}

		}
		return "Driver not found";

	}

	// Method 3: Counts number of drivers belonging to a specific category
	// =====================
	public int retrieveCountOfDriver(List<Driver> driver, String driverCategory) {
		int count = 0;

		for (int i = 0; i < driver.size(); i++) {
			if (driver.get(i) != null && driver.get(i).getCategory() != null
					&& driver.get(i).getCategory().equalsIgnoreCase(driverCategory)) {
				count++;
			}
		}

		return count;
	}

	// Method 4: Retrieves list of drivers belonging to a given category
	// =====================
	public ArrayList<Driver> retrieveDriver(List<Driver> driver, String driverCategory) {
		ArrayList<Driver> result = new ArrayList<>();

		for (int i = 0; i < driver.size(); i++) {
			if (driver.get(i)!=null &&
					driver.get(i).getCategory() != null && 
					driver.get(i).getCategory().equalsIgnoreCase(driverCategory)) {
				result.add(driver.get(i));
			}
		}

		return result;
	}

	// Method 5 =====================
	/**
	 * Finds and returns the driver who has traveled the maximum distance. 
	 * Returns null if the list is empty.
	 */
	public Driver retrieveMaximumDistanceTravelledDriver(List<Driver> driver) {
		if (driver == null || driver.size() == 0) {
			return null;
		}

		Driver maxDriver = null;

		for (int i = 0; i < driver.size(); i++) {
			if (driver.get(i) != null) {
				if (maxDriver == null || driver.get(i).getTotalDistance() > maxDriver.getTotalDistance()) {
					maxDriver = driver.get(i);
				}
			}
		}
		return maxDriver;
	}

}
