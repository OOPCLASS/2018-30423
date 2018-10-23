import org.junit.Test;

public class BusTest {

	@Test
	public void testDrive() {

		// int a=0;

		Bus firstBus = new Bus("Mercedes");
		firstBus.setBrand("Tesla");
		firstBus.setNumber(1);
		firstBus.openDoors();
		System.out.println(firstBus);

		Bus secondBus = new Bus("Mercedes");
		secondBus.setBrand("Renault");
		secondBus.setNumber(2);
		secondBus.openDoors();
		System.out.println(secondBus);
		
		Bus thirdBus = new Bus("Mercedes");
		thirdBus.setBrand("Volvo");
		thirdBus.setNumber(3);
		thirdBus.openDoors();
		System.out.println(thirdBus);
		
		Bus fourthBus = new Bus("Mercedes");
		fourthBus.setBrand("Scandia");
		fourthBus.setNumber(4);
		fourthBus.openDoors();
		System.out.println(fourthBus);
		
		Station myStation = new Station(100);
		myStation.addBus(firstBus);
		myStation.addBus(secondBus);
		myStation.addBus(thirdBus);
		myStation.addBus(fourthBus);
		
		myStation.removeBus(secondBus);
		
		System.out.println(myStation.countBus());
		
		System.out.println();
		
		myStation.listBus();
		
		

		
	}
}
