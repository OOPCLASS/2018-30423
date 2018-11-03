package lab05;

import org.junit.jupiter.api.Test;
import lab05.SmartThermometer;

public class SmartDeviceTest {

	@Test
	public void test() {
		
		SmartThermometer thermostat = new SmartThermometer();
		
		thermostat.setName("Google NEST");
		thermostat.turnOn();
		thermostat.setTemperature(21.5);
		
		System.out.println("The device is " + thermostat.getName() + " and has ID=" + thermostat.getId() + ".");
		System.out.println(thermostat.getStatus() + ".");
		System.out.println("The selected temperature is " + thermostat.getTemperature() + " Celsius degrees.");
			
	}
}
