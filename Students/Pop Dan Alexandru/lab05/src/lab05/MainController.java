package lab05;

public class MainController {

//	private MainController[] rooms = new MainController[10];  // -> association to itself	
	private Room[] rooms = new Room[10];
		
	private int i;
	private int numberOn, numberOff;
	
	public int turnOffAllSmartDevices() {

		// to iterate through all rooms and find devices that are On
		// and to turn them Off
		for (i = 0; i < rooms.length; i++) {
			rooms[i] = new Room();

			if (turnedOn == true) {		// 1st implementation variant

			// 	type casting 'Object': https://stackoverflow.com/questions/5306835/casting-objects-in-java
			// 	((Object) rooms[i]).turnOn(false);
				((Room[10]) rooms[i]).turnOn(false);
				numberOff++;
			}
		}

		// printing how many devices have been turned Off
		System.out.println(numberOff + " devices have been turned off");

		return 0;

	}

	public int turnOnAllSmartDevices() {

		for (i = 0; i < rooms.length; i++) {
			rooms[i] = new Room();
			
			if (turnedOn == false) {	// 2nd implementation variant
			//	rooms[i].turnOn() = true;
				rooms[i].turnedOn = true;
				numberOn++;
			}
		}

		System.out.println(numberOn + " devices have been turned on");

		return 0;

	}

	public SmartDevice[] getAllSmartDevices() {
		
		for (i = 0; i < rooms.length; i++) {
			return rooms[i].name;
		}

	}

	public String getStatus() {
		
		StringBuilder stringBuilder = new StringBuilder();

		for (i = 0; i < rooms.length; i++) {
			
			return stringBuilder.append("Device ID is: id=")
								.append(id)
								.append(", its name is ")
								.append(name)
								.append(" and functioning status is ")
								.append(turnedOn)	// true or false
								.toString();
		}
	}
}
