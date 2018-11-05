package Controller;

import Devices.SmartDevice;
import Room.Room;

public class MainController {

	Room[] room = new Room[10];

	public int turnOffAllSmartDevices() {
		int numberOfTurnedOffDevices = 0;

		SmartDevice[] smartDevice = getAllSmartDevices();
		for (int i = 0; i < smartDevice.length; i++) {

			if (smartDevice[i].isTurnedOn()) {
				numberOfTurnedOffDevices++;
				smartDevice[i].turnOff();
			}

		}

		return numberOfTurnedOffDevices;
	}

	public int turnOnAllSmartDevices() {
		int numberOfTurnedOnDevices = 0;

		SmartDevice[] smartDevice = getAllSmartDevices();
		for (int i = 0; i < smartDevice.length; i++) {

			if (!smartDevice[i].isTurnedOn()) {
				numberOfTurnedOnDevices++;
				smartDevice[i].turnOff();
			}

		}

		return numberOfTurnedOnDevices;
	}

	public boolean addRoom(Room newRoom) {
		for (int i = 0; i < 10; i++) {
			if (room[i] == null) {
				room[i] = newRoom;
				return true;
			}
		}
		return false;
	}

	public SmartDevice[] getAllSmartDevices() {
		int numberOfDevices = 0;
		int i = 0;

		while (room[i] != null && i < 10) {
			SmartDevice[] smartDevice = room[i].getSmartDevice();
			int j = 0;
			while (smartDevice[j] != null && j < 5) {
				numberOfDevices++;
				j++;
			}

		}

		SmartDevice[] allSmartDevices = new SmartDevice[numberOfDevices];
		int count = 0;
		i = 0;
		while (room[i] != null && i < 10) {

			SmartDevice[] smartDevice = room[i].getSmartDevice();
			int j = 0;
			while (smartDevice[j] != null && j < 5) {
				allSmartDevices[count++] = smartDevice[j];
			}

		}
		return allSmartDevices;

	}

	// STRINGBUILDER
	public String getStatus() {
		StringBuilder mySBuilder = new StringBuilder();
		int i = 0;
		while (room[i] != null && i < 10) {
			mySBuilder.append(room[i].getStatus());
			mySBuilder.append("\n");
			i++;
		}
		return mySBuilder.toString();
	}

}
