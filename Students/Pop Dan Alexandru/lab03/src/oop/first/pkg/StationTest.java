package oop.first.pkg;

import org.junit.Test;

class StationTest {

	@Test
	public void allStationsDetails() {

		Station firstStation = new Station("Station 1", 2);
		firstStation.setStationCapacity(1);		// modifying the capacity of the station to 1 bus
		System.out.println(firstStation.getStationName());	// printing the name of the station and the capacity
		firstStation.stationInformation();
		
		Station secondStation = new Station("Station 2", 3);
		secondStation.setStationCapacity(2);
		System.out.println(secondStation.getStationName());
		secondStation.stationInformation();

	}

}
