package uml.pkg;

import uml.pkg.SmartDevice;

public class ROOM {
	
	private String name;
	private SmartDevice[] devices = new SmartDevice[10];
	
	
	public ROOM() {
		
		
	};
	
public boolean addSmartDevice(SmartDevice S1) {
	for(int i=0;i<10;i++)
	{
		if(devices[i]==null) {
			    devices[i]=S1;
			    return true;
		}
		
	}
	return false;
	
}

public SmartDevice[] getSmartDevice() {
	return devices;
}

public String getStatus() {
	StringBuilder mySBuilder = new StringBuilder();
	mySBuilder.append("In room: ")
			.append(name)
			.append(" we have the following devices:");
	int i=0;
	while(devices[i]!=null)
	{
			mySBuilder.append("\n\t\t");
			mySBuilder.append(devices[i].getStatus());
			i++;
	}
	return mySBuilder.toString();
	
}



public void setName(String name) {
	this.name= name;
}

public String getName() {
	
	return name;
}
}
