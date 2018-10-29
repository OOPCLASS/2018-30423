package oop.first.pkg;

public class StationTest {

	public void testStation() {
		Station firstStation = new Station("Malinului",3);
		Bus firstBus = new Bus("Mercedes","blue",50,25);
		firstStation.addBus(firstBus);
		firstStation.printBus();
	}
}
