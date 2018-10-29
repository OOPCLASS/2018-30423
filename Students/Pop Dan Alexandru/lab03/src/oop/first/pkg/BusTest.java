package oop.first.pkg;

import org.junit.Test;

public class BusTest {

	@Test
	public void testDrive() {

		// create an instance (an object)
		Bus firstBus = new Bus("Mercedes", 60, 35); // firstBus == an object
		// instantiate by using the keyword 'new'
		// firstBus.brand = "TESLA"; // not like this (overwrites the brand)
		firstBus.openDoors();
		// firstBus.setBrand("M"); 	// we can delete it since it is initialised at line 11
		firstBus.setNumberOfSeats(59);	// overwrites the initial number of seats (60)
		System.out.println(firstBus.getBrand());
		
		// assert.assertEquals(50, firstBus.getNumberOfSeats());
		System.out.println(firstBus);
		firstBus.sayHello();
		

		Bus secondBus = new Bus("Tesla", 80, 50); // secondBus == also an object
		secondBus.openDoors();
		//secondBus.setBrand("T");
		secondBus.setNumberOfSeats(20);
		System.out.println(secondBus.getBrand());

		System.out.println(secondBus);
		secondBus.sayHello();

	}

}