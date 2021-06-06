package ParkingAccessories;

import types.ParkingSlotType;

public abstract class ParkingSpot {
	 private String number;
	  private boolean free;
	  private Vehicle vehicle;
	  private final ParkingSlotType type;

	  public boolean IsFree();

	  public ParkingSpot(ParkingSlotType type) {
	    this.type = type;
	  }

	  public boolean assignVehicle(Vehicle vehicle) {
	    this.vehicle = vehicle;
	    free = false;
	  }

	  public boolean removeVehicle() {
	    this.vehicle = null;
	    free = true;
	  }

}
