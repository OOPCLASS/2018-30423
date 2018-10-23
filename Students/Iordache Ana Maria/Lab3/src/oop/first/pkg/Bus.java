package oop.first.pkg;

public class Bus {
	
	private int number;
	private String brand;
	private String color;
	private int numberOfSeats;
	
	//constructors are most of the times public
	//like a method, the only method that starts with a capital letter, must hav the same name like the class
	//doesn't have a return value
	//gets called when we instantiate a class
	public Bus() {
		this.brand = "default-brand";
		this.color = "default-color";
		this.numberOfSeats = 52;
	}
	
	public Bus(String brand) {
		this.brand = brand;
	}
	
	public Bus(int number, String brand, String color, int numberOfSeats) {
		this.number = number;
		this.brand = brand;
		this.color = color;
		this.numberOfSeats = numberOfSeats;
	}
	
	public void sayHello() {
		System.out.println("I am bus number " + this.number + " and my specs are: brand: " + this.brand + ", color: " + this.color + ", number of seats: " + this.numberOfSeats);
	}
	//ENCAPSULATION create private attributes and then public setters and getters => you can control the values
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	@Override
	public String toString() {
		
		return "number: " + this.number + "\nbrand: " + this.brand + "\ncolor: " + this.color + "\nnumber of seats: " + this.numberOfSeats + "\n";
	}
}
