package uml.pkg;

public class MainController {
	
	private SmartDevice[] devices = new SmartDevice[10];
	
	public MainController() {
		
	}

	public int turnOffAllSmartDevices() {
		
		int deviceNo = 0;
		SmartDevice[] devices = getAllSmartDevices();
		for (int i = 0; i < devices.length; i++) {
			if (devices[i].isTurnedOn()) {
				deviceNo++;
				devices[i].turnOff();
			}
		}
		return deviceNo;	
	}
	
	public int turnOnAllSmartDevices() {
		
		int deviceNo = 0;
		SmartDevice[] devices = getAllSmartDevices();
		for (int i = 0; i < devices.length; i++) {
			if (devices[i].isTurnedOff()) {
				deviceNo++;
				devices[i].turnOn();
			}
		}
		return deviceNo;
	}
	
	public SmartDevice[] getAllSmartDevices() {
		return devices;	}
	
	public String getStatus() {
		String status="";
		return status;
	}
	
	
}
