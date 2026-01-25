package com;

public class Travel extends Object{
	
	

	boolean isCarDriver(Driver driver) {
		
		if(driver.getCategory().equalsIgnoreCase("Car")) {
			return true;
		}
		else {
			return false;
		}
	}

	
	
	String retrieveByDriverId(Driver[] drivers, int driverId) {

	    for (int i = 0; i < drivers.length; i++) {

	        if (drivers[i] != null && drivers[i].getDriverId() == driverId) {
	            return "Driver name is " + drivers[i].getDriverName() +
	                   " belonging to the category " + drivers[i].getCategory() +
	                   " traveled " + drivers[i].getTotalDistance() + " KM so far";
	        }
  
	}
	    return "Driver not found";
	}
	
	
	int RetriveCountOfDriver(Driver[] driver, String category) {
		int count=0;
		
			for(int i=0; i<driver.length; i++) {
				if(driver[i] !=null && driver[i].getCategory().equalsIgnoreCase(category)) {
					count++;
				}
			}
			return count;
	}
	
	
	String[] retriveDriver (Driver[] driver, String category) {
		String [] result = new String[driver.length];		//possible case that may all drivers in the array can match, so we created the array to driver size
		int count=0;
		
		for (int i=0; i<driver.length; i++) {
			if(driver[i] !=null 
					&&driver[i].getCategory()!= null 
						&&driver[i].getCategory().equalsIgnoreCase(category)){
				result[count]= driver[i].getDriverName();
				count++;
			}
		}
		
		if(count==0) {
			return null;
		}
		
		String[] finalResult = new String[count];
		
		for (int i = 0; i < count; i++) {
		    finalResult[i] = result[i];
		}

		return finalResult;
		
	}
	
	
					//if we want only driver name 	
				//	String RetriveMaximumDistanceTravelledDriver (Driver[] driver){		
				//		if (driver == null || driver.length == 0) {
				//	        return null;
				//	    }
				//
				//		double maximum = driver[0].getTotalDistance();
				//		String maxDriverName=null;
				//		
				//		for (int i=1; i<driver.length;i++) {
				//			if(driver[i].getTotalDistance()>maximum) {
				//				maximum= driver[i].getTotalDistance();
				//				maxDriverName= driver[i].getDriverName();
				//			}
				//			
				//		}
				//		
				//		return maxDriverName !=null ? maxDriverName : "No Driver Found";
				//	}
	
	
	//If we need to return the total object of driver who has max Speed
	Driver RetriveMaximumDistanceTravelledDriver(Driver[] driver) {
		if (driver == null || driver.length == 0) {
				        return null;
				    }
		
			Driver maxDriver= null;
			
			for (int i=0; i<driver.length; i++) {
				
				if(driver[i]!= null) {
					
					if (maxDriver == null ||
			                driver[i].getTotalDistance() > maxDriver.getTotalDistance()) {
						maxDriver= driver[i];
					}
				}
			}
			
			return maxDriver;
	}
	
	
	
	

}
