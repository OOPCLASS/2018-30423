package lab05;

public class Room {

	private String name;
	private SmartDevice[] smartDevices;
	private final int MAX_SMART_DEVICES = 5;

	public Room() {
		
	}
	
	public boolean addSmartDevice(SmartDevice smartDevice) {
		for (int i = 0; i < MAX_SMART_DEVICES; i++) {
			if (smartDevices[i] == null) {
				smartDevices[i] = smartDevice;
				return true;
			}
		}
		return false;
	}
	
	public SmartDevice[] getSmartDevices() {
		return smartDevices;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Room specs: name=")
				.append(name)
				.append("smartDevices=");
		int i = 0;
		while(smartDevices[i]!=null) {
			stringBuilder.append("\n\t")
			.append(smartDevices[i].getStatus());
			i++;
		}
		return stringBuilder.toString();
	}
	
}
