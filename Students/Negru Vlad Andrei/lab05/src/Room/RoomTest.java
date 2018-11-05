package Room;

import org.junit.Test;

import Devices.SmartLightBulb;
import Devices.SmartThermometer;

public class RoomTest {
	
	@Test
	public void roomTest()
	{
		Room myRoom = new Room();
		SmartLightBulb myDevice = new SmartLightBulb();
		myDevice.setName("Bulb1");
		myDevice.turnOn();
		SmartThermometer myThermo = new SmartThermometer();
		myThermo.setName("Thermo1");
		
		myRoom.addSmartDevice(myDevice);
		myRoom.addSmartDevice(myThermo);
		myRoom.setName("Baie");
		System.out.println(myRoom.getStatus());
	}
}
