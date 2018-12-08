
public class Bus {

	public String brand;
	private int numberOfSeats;
	private int number;

	public Bus(String brand) {
		this.brand = brand;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void openDoors() {
		System.out.println("I`m opening my doors");
	}

	public String getBrand() {
		return brand;
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

	@Override
	public String toString() {

		return "Bus number " + this.number + " specifications: brand: " + this.brand + " \n";
	}

}
