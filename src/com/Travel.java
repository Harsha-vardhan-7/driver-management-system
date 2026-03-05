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

	// Method 1: Checks whether a given driver belongs to "Car" category 
	/**
	 * Checks whether the given driver belongs to the "Car" category.
	 *
	 * @param driver the Driver object to be checked
	 * @return true if the driver belongs to the "Car" category, otherwise false
	 */
	public boolean isCarDriver(Driver driver) {
		if (driver != null && driver.getCategory() != null && driver.getCategory().equalsIgnoreCase("car")) {
			return true;
		}
		return false;
	}

	// Method 2 
	/**
	 * Retrieves driver details based on the given driver ID.
	 *
	 * The method searches the provided driver list and returns formatted
	 * driver information if a matching driver is found. If no matching
	 * driver exists, it returns "Driver not found".
	 *
	 * @param drivers the list of drivers
	 * @param driverID the driver ID to search for
	 * @return formatted driver details if found, otherwise "Driver not found"
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

	// Method 3: Counts number of drivers belonging to a specific category 
	/**
	 * Counts the number of drivers belonging to a specific category.
	 *
	 * The comparison is case-insensitive and ignores null drivers
	 * or drivers with null categories.
	 *
	 * @param drivers the list of drivers
	 * @param driverCategory the category to count (e.g., Car, Auto, Lorry)
	 * @return the total number of drivers matching the given category
	 */
	public long retrieveCountOfDriver(List<Driver> drivers, String driverCategory) {
		if (drivers == null || driverCategory == null) {
			return 0;
		}

		return drivers.stream().filter(dr -> dr != null && dr.getCategory() != null)
				.filter(dr -> dr.getCategory().equalsIgnoreCase(driverCategory)).count();
	}

	// Method 4: Retrieves list of drivers belonging to a given category 
	/**
	 * Retrieves all drivers belonging to a specific category.
	 *
	 * The comparison is case-insensitive and ignores null drivers
	 * or drivers with null categories.
	 *
	 * @param drivers the list of drivers
	 * @param driverCategory the category to filter by
	 * @return a list of drivers belonging to the given category.
	 *         Returns an empty list if none are found.
	 */
	public List<Driver> retrieveDriver(List<Driver> drivers, String driverCategory) {
		if (drivers == null || driverCategory == null) {
			return new ArrayList<>();
		}

		return drivers.stream().filter(dr -> dr != null && dr.getCategory() != null)
				.filter(dr -> dr.getCategory().equalsIgnoreCase(driverCategory)).collect(Collectors.toList());
	}

	// Method 5 
	/**
	 * Finds the driver who has traveled the maximum distance.
	 *
	 * The method filters out null drivers and determines the driver
	 * with the highest totalDistance value.
	 *
	 * @param drivers the list of drivers
	 * @return the driver with the maximum traveled distance,
	 *         or null if the list is empty
	 */
	public Driver retrieveMaximumDistanceTravelledDriver(List<Driver> drivers) {
		if (drivers == null || drivers.isEmpty()) {
			return null;
		}

		return drivers.stream().filter(dr -> dr != null).max(Comparator.comparing(dr -> dr.getTotalDistance()))
				.orElse(null);
	}

}
