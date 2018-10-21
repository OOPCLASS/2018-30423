package station.pkg;
//We have the name of the stations and the busses that pass through that station

public class Station {
	private String finishStationName;
	private String startStationName;
	private String brand;
	private String color;
	private int numberOfSeats;
	//public int numberOfBusses=3;
	//public int counter=0;
	
	//We will set the default values
	public void bus() {
		this.startStationName="default-start";
		this.finishStationName="default-station";
		this.brand="default-brand";
		this.color="default-color";
		this.numberOfSeats=0;
		System.out.println("Creating the bus!");
	}
	
	public void bus(String finishStationName, String startStationName,String brand, String color, int numberOfSeats) {
		this.brand=brand;
		this.color=color;
		this.numberOfSeats=numberOfSeats;
		System.out.println("Creating the bus wuth certain values!");
		this.finishStationName=finishStationName;
		this.startStationName=startStationName;
		System.out.println("The driver goes from" + finishStationName + "to" + startStationName);
	}
		
	//We create setter and getters
	public String getStartStationName() {
		return startStationName;
	}
	
	public void setStartStationName(String startStationName) {
		this.startStationName = startStationName;
	}
	
	public String getFinishStationName() {
		return finishStationName;
	}
	
	public void setFinishStationName(String finishStationName) {
		this.finishStationName = finishStationName;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public int getNumberOfSeats(){
		return numberOfSeats;
	}
	
	public void setColor(String color) {
		this.color = color	;
	}
	
	public String getColor(){
		return color;
	}
	
	/*public void setNumberOfBusses(int numberOfBusses) {
		this.numberOfBusses = numberOfBusses;
	}
	
	public int getNumberOfBusses(){
		return numberOfBusses;
	}*/
}
