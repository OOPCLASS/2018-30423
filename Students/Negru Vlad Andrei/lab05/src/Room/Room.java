package Room;

import Devices.SmartDevice;

public class Room {
	private String name;
	private SmartDevice[] smartDevice = new SmartDevice[5];

	
	
	
	public boolean addSmartDevice(SmartDevice newDevice) {
		for (int i = 0; i < 5; i++) {
			if (smartDevice[i] == null) {
				smartDevice[i] = newDevice;
				return true;
			}
		}
		return false;
	}

	public SmartDevice[] getSmartDevice() {
		return smartDevice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getStatus()
	{
		StringBuilder mySBuilder = new StringBuilder();
		mySBuilder.append("In room: ")
				.append(name)
				.append(" we have the following devices:");
		int i=0;
		while(smartDevice[i]!=null)
		{
				mySBuilder.append("\n\t\t");
				mySBuilder.append(smartDevice[i].getStatus());
				i++;
		}
		return mySBuilder.toString();
		
	}

}
