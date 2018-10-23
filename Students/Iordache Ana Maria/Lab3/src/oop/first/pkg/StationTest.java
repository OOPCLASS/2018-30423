package oop.first.pkg;
import org.junit.Test;

public class StationTest {
    @Test
	public void theUltimateTest() {
		Station firstStation = new Station("BETA", "Cluj-Napoca");
		Bus firstBus = new Bus (1, "MERCEDES", "white", 50);
		Bus secondBus = new Bus (2, "ICARUS", "blue", 52);
		Bus thirdBus = new Bus (3, "PORSCHE", "black", 54);
		firstStation.addBus(firstBus);
		firstStation.addBus(secondBus);
		firstStation.addBus(thirdBus);
		int index = firstStation.getIndexOfBus();
		for (int i = 0; i < index; i++) {
			System.out.println(firstStation.getBus()[i].toString());
		}
	}
	
}
