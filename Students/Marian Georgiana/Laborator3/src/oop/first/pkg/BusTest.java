package oop.first.pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

//import org.junit.Test;

public class BusTest {
	@Test
	public void testDrive() {
		//exemplification of the 3 constructors
		Bus firstBus = new Bus("Mercedes","White",50,25);
		System.out.println(firstBus.getBrand());
		Bus secondBus = new Bus("Icarus");
		Bus thirdBus = new Bus();
//		firstBus.print();
//		
//		
//		
//		firstBus.drive("Cluj-Napoca", "Bucharest");
//		System.out.println(firstBus.publicVariable); //accessible from outside
//		System.out.println(firstBus.getBrand()); //uninitialised yet, null cause String is a class
//		firstBus.setBrand("ICARUS");
//		System.out.println(firstBus.getBrand());
//		System.out.println(firstBus.getNumberOfSeats()); //0 cause it is a primitive type
//		
//		Bus fourthBus = new Bus();
//		fourthBus.drive("Cluj-Napoca", "Bucharest");
//		fourthBus.setBrand("MERCEDES");
//		System.out.println(fourthBus.getBrand());
//		System.out.println(fourthBus.getNumberOfSeats());
	}
}
