package oop.first.pkg;

import org.junit.Test;

public class BusTest {
	
	@Test
	public void testDrive() {
		Bus firstBus = new Bus(1, "MERCEDES", "white", 50);
		firstBus.sayHello();
		Bus secondBus = new Bus("ICARUS");
		Bus thirdBus = new Bus();
	}

}
