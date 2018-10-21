package oop.first.pkg;

public class Station {
	// Must have: array of busses, name of the station. Print existing busses 
	// Create a Test Case for this class

	private String stationName;
	private int stationCapacity = 2;
	// private Bus [] busInStation = new Bus[stationCapacity]; // the array of busses
	// for (int i = 0; i < Station.length; i++)
	//     busInStation[i] = new Bus();
	
	public Station() {
	}

	public Station(String stationName, int stationCapacity) {
		this.stationName = stationName;
		this.stationCapacity = stationCapacity;
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
