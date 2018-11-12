package uml.pkg;

public class SmartThermometer extends SmartDevice {
	private double temperature;
	
	public SmartThermometer() {
		
	}

	private double getTemperature() {
		
		return temperature;
	}
	
	private void setTemperature(double Temperature) {
		this.temperature=Temperature;
	}
}
