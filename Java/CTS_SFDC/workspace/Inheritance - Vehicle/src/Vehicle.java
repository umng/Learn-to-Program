
public class Vehicle {
	protected String make, vehicleNumber, fuelType;
	protected int fuelCapacity, cc;
	
	public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void displayMake() {
		System.out.printf("***%s***\n", make);
	}
	
	public void displayBasicInfo() {
		System.out.printf("---Basic Information---\nVehicle Number:%s\nFuel Capacity:%d\nFuel Type:%s\nCC:%d\n", vehicleNumber, fuelCapacity, fuelType, cc);
	}
	
	public void displayDetailInfo() {
		
	}
	
}
