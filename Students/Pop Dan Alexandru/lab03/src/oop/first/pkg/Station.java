package oop.first.pkg;

public class Station {
	// Must have: array of busses, name of the station 
	// Create a Test Case for this class

	private String stationName;
	private int stationCapacity = 3;
	private Bus[] stationForBusses = new Bus[stationCapacity]; // the array for busses
	// -> to instantiate (allocate memory for) the array:
	// for (int i = 0; i < stationForBusses.length; i++)
	//  	stationForBusses[i] = new Bus();		// if uncommented: Syntax error, insert "}" to complete Block
	
	
	public Station() {
	}

	public Station(String stationName, int stationCapacity) {
		this.stationName = stationName;
		this.stationCapacity = stationCapacity;
	}

	public void stationInformation() {
		System.out.println("This is the station " + stationName + " and has a capacity of " + stationCapacity);
	}
	
	public String getStationName() {
		return String.format("The station is %s", stationName);
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public int getStationCapacity() {
		return stationCapacity;
	}

	public void setStationCapacity(int stationCapacity) {
		this.stationCapacity = stationCapacity;
	}

	@Override
	public String toString() {
		return String.format("Station is %s", stationName);
	}
}
