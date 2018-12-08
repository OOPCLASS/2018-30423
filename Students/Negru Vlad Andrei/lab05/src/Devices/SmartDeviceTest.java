package Devices;

import org.junit.Test;

public class SmartDeviceTest {
		
	@Test
	public void smartDeviceTest()
	{
		SmartLightBulb myDevice = new SmartLightBulb();
		myDevice.setColor("Red");
		myDevice.setIntensity(20);
		myDevice.setName("Bulb1");
		System.out.println(myDevice.getStatus());
		myDevice.turnOn();
		System.out.println(myDevice.getStatus());
	}
}
