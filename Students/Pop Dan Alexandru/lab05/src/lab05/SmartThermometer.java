package lab05;

public class SmartThermometer extends SmartDevice {
	
	private double temperature;
	
	public SmartThermometer() {
		super(1);		// calls the SUPERCLASS form the INHERITANCE HIERARCHY
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public double getTemperature() {	
		return temperature;
	}	
}
