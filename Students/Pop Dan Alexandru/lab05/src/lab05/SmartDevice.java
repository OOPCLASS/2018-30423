package lab05;

public class SmartDevice {
	
	private int id;
	private String name;
	private boolean turnedOn;
	
	public SmartDevice(int id) {
		this.id = id;
	}
	
	public void turnOn() {
		this.turnedOn = true;
	}
	
	public void turnOff() {
		this.turnedOn = false;
	}
	
	public int getId(){
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getStatus() {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		return stringBuilder.append("Device with ID=")
							.append(id)
							.append(" and name ")
							.append(name)
							.append(" has the functioning status as ")
							.append(turnedOn)	// true or false
							.toString();
	}

	private void append() {
		// TODO Auto-generated method stub
	}	
}
