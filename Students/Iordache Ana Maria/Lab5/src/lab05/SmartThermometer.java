package lab05;

public class SmartThermometer extends SmartDevice {
	private double temperature;
	
	public SmartThermometer() {
		
	}
	
	public double getTemperature() {
		return this.temperature;
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
}
