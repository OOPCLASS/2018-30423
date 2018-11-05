package lab05;

public class SmartDevice {

	private int id;
	private String name;
	private boolean turnedOn;
	private String status;

	public SmartDevice() {
		this.id = IdGenerator.getNextId();
	}
	
	public void turnOn() {
		this.turnedOn = true;
	}
	
	public void turnOff() {
		this.turnedOn = false;
	}
	
	public boolean isTurnedOn() {
		return this.turnedOn;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getStatus() {
		StringBuilder stringBuilder = new StringBuilder();
		return stringBuilder.append("Device specs: id=")
				.append(id)
				.append(", name=")
				.append(name)
				.append(", turnedOn= ")
				.append(turnedOn)
				.toString();
				
	}
}
