package oop.first.pkg;

import org.junit.Test;

class StationTest {

	@Test
	public void stationDetails() {

		Station firstStation = new Station("Piata Mihai Viteazul", 2);
		firstStation.setStationCapacity(1);		// modifying the capacity of the station to 1 bus
		System.out.println(firstStation.getStationName());	// printing the name of the station and the capacity
		
		Station secondStation = new Station("Piata Garii", 3);
		secondStation.setStationCapacity(2);
		System.out.println(secondStation.getStationName());

	}

}
