package uml.pkg;

import uml.pkg.ROOM;

public class Main {

	public static void main(String[] args) {
		ROOM room1 = new ROOM();
		SmartLightBulb B1=new SmartLightBulb();
		SmartThermometer T1 = new SmartThermometer();
		room1.addSmartDevice(B1);
		B1.setName("BEC1");
		B1.isTurnedOff();
		B1.turnOn();
		B1.isTurnedOn();
		room1.addSmartDevice(T1);
		T1.setName("Termometruu");
		T1.isTurnedOff();
		String name = T1.getName();
		System.out.println(name);
	
}
}
