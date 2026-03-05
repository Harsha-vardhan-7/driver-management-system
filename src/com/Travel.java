package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Travel service class responsible for performing business operations on Driver
 * objects.
 */
public class Travel {

	// Method 1: Checks whether a given driver belongs to "Car" category =====================
	public boolean isCarDriver(Driver driver) {
		if (driver != null && driver.getCategory() != null && driver.getCategory().equalsIgnoreCase("car")) {
			return true;
		}
		return false;
	}

	// Method 2 =====================
	/**
	 * Retrieves driver details based on driver ID. Returns formatted string if
	 * found, otherwise returns "Driver not found".
	 */
	public String retrieveByDriverId(List<Driver> drivers, int driverID) {
		if (drivers == null || drivers.isEmpty()) {
			return "Driver not found";
		}

		return drivers.stream().filter(driver -> driver != null).filter(driver -> driver.getDriverId() == driverID)
				.findFirst()
				.map(driver -> "Driver name is " + driver.getDriverName() + " Belonging to the category "
						+ driver.getCategory() + " traveled " + driver.getTotalDistance() + " KM so far.")
				.orElse("Driver not found");
	}

	// Method 3: Counts number of drivers belonging to a specific category =====================
	public long retrieveCountOfDriver(List<Driver> drivers, String driverCategory) {
		if (drivers == null || driverCategory == null) {
			return 0;
		}

		return drivers.stream().filter(dr -> dr != null && dr.getCategory() != null)
				.filter(dr -> dr.getCategory().equalsIgnoreCase(driverCategory)).count();
	}

	// Method 4: Retrieves list of drivers belonging to a given category =====================
	public List<Driver> retrieveDriver(List<Driver> drivers, String driverCategory) {
		if (drivers == null || driverCategory == null) {
			return new ArrayList<>();
		}

		return drivers.stream().filter(dr -> dr != null && dr.getCategory() != null)
				.filter(dr -> dr.getCategory().equalsIgnoreCase(driverCategory)).collect(Collectors.toList());
	}

	// Method 5 =====================
	/**
	 * Finds and returns the driver who has traveled the maximum distance. Returns
	 * null if the list is empty.
	 */
	public Driver retrieveMaximumDistanceTravelledDriver(List<Driver> drivers) {
		if (drivers == null || drivers.isEmpty()) {
			return null;
		}

		return drivers.stream().filter(dr -> dr != null).max(Comparator.comparing(dr -> dr.getTotalDistance()))
				.orElse(null);
	}

}
