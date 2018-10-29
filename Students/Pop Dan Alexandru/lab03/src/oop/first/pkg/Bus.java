package oop.first.pkg;

public class Bus {

	// attributes on top:
	private String brand; // == char[] brand
	private int numberOfSeats;
	private int busNumber;

	// private int arr[];

	// it is automatically written
	public Bus() {
	}

	public Bus(String brand) {
		this.brand = brand;
	}

	public Bus(String brand, int numberOfSeats, int busNumber) {
		this.brand = brand;
		this.numberOfSeats = numberOfSeats;
		this.busNumber = busNumber;
	}

	// methods for capacity of busses
	public void openDoors() {
		System.out.println("I'm opening my doors");
	}

	public void sayHello() {
		System.out.println("I'm bus number " + busNumber + " and have " + numberOfSeats + " seats.\n");
	}

// automatically written:
	// ENCAPSULATION:
	public String getBrand() {
		return String.format("Brand is %s", brand);
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getBusNumber() {
		return busNumber;
	}
	
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
// until here	

	@Override
	public String toString() {
		return String.format("Brand is %s", brand);
	}

}
