package com;

import java.util.ArrayList;

public class Travel {
	
	
	//Method 1 =====================
	public boolean isCarDriver(Driver driver) {
		if(driver!=null && driver.getCategory()!=null && driver.getCategory().equalsIgnoreCase("car")) {
			return true;
		}
		return false;
	}
	
	//Method 2 =====================
	public String retriveByDriverId (ArrayList<Driver> driver, int driverID) {
		for (int i=0; i<driver.size(); i++) {
			if(driver.get(i) != null && driver.get(i).getDriverId()==driverID) {
				return "Driver name is " + driver.get(i).getDriverName()
						+" Belonging to the category"+ driver.get(i).getCategory() 
						+"traveled"+ driver.get(i).getTotalDistance() +" KM so far.";
			}
			
		}
		return "Driver not found";
	}
	
	
	//Method 3 =====================
	public int retriveCountOfDriver (ArrayList<Driver> driver,String driverCategory) {
		int count=0;
		
		for (int i=0; i<driver.size(); i++) {
			if(driver.get(i)!=null &&driver.get(i).getCategory() !=null && driver.get(i).getCategory().equalsIgnoreCase(driverCategory)) {
				 count++;
			}
		}
		
		return count;
	}
	
	
	//Method 4 =====================
	public ArrayList<Driver> retriveDriver (ArrayList<Driver> driver,String driverCategory) {
		ArrayList<Driver> result = new ArrayList<>();
		
		for(int i=0; i<driver.size(); i++) {
			if(driver.get(i).getCategory() != null && driver.get(i).getCategory().equalsIgnoreCase(driverCategory)) {
				result.add(driver.get(i));
			}
		}
		
		return result;
	}

	
	//Method 5 =====================
	public Driver retriveMaximumDistanceTravelledDriver (ArrayList<Driver> driver) {
		if (driver ==null || driver.size()==0) {
			return null;
		}
		
		Driver maxDriver= null;
		
		for (int i=0; i<driver.size(); i++) {
			if(driver.get(i)!= null) {
				if (maxDriver== null || driver.get(i).getTotalDistance()>maxDriver.getTotalDistance()) {
					maxDriver= driver.get(i);
				}
			}
		}
		return maxDriver;
	}
	
	
}	
