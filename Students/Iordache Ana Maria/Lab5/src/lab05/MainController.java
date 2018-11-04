package lab05;

public class MainController {
	
	private final int MAX_ROOMS = 10;
	private final int MAX_DEVICES = 5;

	private int numberOfDevices = 0;
	private int roomNumber = 0;
	
	Room[] rooms = new Room[MAX_ROOMS];
	SmartDevice[] smartDevices = getAllSmartDevices();
	
	public MainController() {
		
	}
	
	public int turnOffAllSmartDevices() {
		int count = 0;
		
		for (int i = 0; i < smartDevices.length; i++) {
			if (smartDevices[i].isTurnedOn()) {
				smartDevices[i].turnOff();
				count++;
			}
		}
		return count;
	}
	
	public int turnOnAllSmartDevices() {
		int count = 0;
		for (int i = 0; i < rooms.length; i++) {
			if (smartDevices[i].isTurnedOn() == false) {
				smartDevices[i].turnOn();
				count++;
			}
		}
		return count;
	}
	
	public SmartDevice[] getAllSmartDevices() {
		for (int i = 0; i < MAX_ROOMS; i++) {
			if (rooms[i] == null) {
				break;
			}
			SmartDevice[] smartDevices = rooms[i].getSmartDevices();
			for (int j = 0; j < MAX_DEVICES; j++) {
				if (smartDevices[j] == null) {
					break;
				}
				this.numberOfDevices++;
			}
		}
		return smartDevices;
		
	}
	
	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < rooms.length; i++) {
			stringBuilder.append(rooms[i].getStatus())
			.append("\n");
		}
		return stringBuilder.toString();
	}
}
