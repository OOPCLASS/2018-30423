package Controller;

import org.junit.Test;

import Devices.SmartDevice;
import Devices.SmartLightBulb;
import Devices.SmartThermometer;
import Room.Room;


public class MainControllerTest {

	@Test
	public void testMainController()
	{
		MainController mainController = new MainController();
		
		Room testRoom = new Room();
		SmartDevice testDevice = new SmartLightBulb();
		testDevice.turnOn();
		testRoom.addSmartDevice(testDevice);
		testDevice = new SmartThermometer();
		testDevice.turnOn();
		testRoom.addSmartDevice(testDevice);
		testDevice = new SmartLightBulb();
		testRoom.addSmartDevice(testDevice);
		testRoom.setName("Bathroom");
		mainController.addRoom(testRoom);
		
		
		testRoom = new Room();
		testRoom.setName("Bedroom");
		SmartLightBulb newDevice = new SmartLightBulb();
		newDevice.setName("BecD1");
		
		testRoom.addSmartDevice(newDevice);
		mainController.addRoom(testRoom);
		
		
		
		System.out.println(mainController.getStatus());
	
		
	}
	
}
