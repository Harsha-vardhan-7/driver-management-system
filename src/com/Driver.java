package com;

public class Driver {

		private int driverId;
		private String driverName;
		private String category;
		private double totalDistance;
		
		Driver(){
			
		}
		
		Driver (int driverId, String driverName,String category,double totalDistance){
				this.driverId=driverId;
				this.driverName=driverName;
				this.category=category;
				this.totalDistance=totalDistance;
		}
		
		
		public int getDriverId() {
			return driverId;
		}
		public void setDriverId(int driverId) {
			this.driverId = driverId;
		}
		
		public String getDriverName() {
			return driverName;
		}
		public void setDriverName(String driverName) {
			this.driverName = driverName;
		}
		
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			if (category == null) {
		        System.out.println("Invalid category");
		        return;
		    }

		    if (category.equalsIgnoreCase("Car") ||
		        category.equalsIgnoreCase("Auto") ||
		        category.equalsIgnoreCase("Lorry")) {
		        this.category = category;
		    } else {
		        System.out.println("Invalid category");
		    }
		}
		
		public double getTotalDistance() {
			return totalDistance;
		}
		public void setTotalDistance(double totalDistance) {
			this.totalDistance = totalDistance;
		}
		
		
			@Override
			public String toString() {
			    return "Driver id is: "+ driverId +" "+",Driver name is: " + driverName +" "+
			           ",belonging to the category: "+ category +" "
			           +",traveled: "+ totalDistance +" "+ "KM so far";
			}

		
}
