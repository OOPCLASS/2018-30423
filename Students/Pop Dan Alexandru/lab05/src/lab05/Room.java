package lab05;

public class Room {

	private String name;

	private SmartDevice[] smartDevices = new SmartDevice[5];

	
	// the constructor
	public Room() {
	}

	public boolean addSmartDevice(SmartDevice smartDevice) {

		if (this.smartDevices.length == 5) {
			System.out.println("Can't be added more devices");

			return false;
		}

		for (int i = 0; i < smartDevices.length; i++) {
			this.smartDevices[i] = smartDevice;
		}

		return true;

	}

	public SmartDevice[] getSmartDevices() {

		return this.smartDevices;

	}

	public String getStatus() {
		
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < smartDevices.length; i++) {
			return stringBuilder.append("Device ID is: id=")
								.append(smartDevices[i].id)
								.append(", its name is ")
								.append(smartDevices[i].name)
								.append(" and functioning status is ")
								.append(smartDevices[i].turnedOn) // true or false
								.toString();
		}
		
		// smartDevices.getStatus();
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
