package lab05;

public class SmartLightBulb extends SmartDevice {
	
	private String color;
	
	private int intensity;
	
	public SmartLightBulb() {	// Implicit super constructor SmartDevice() is undefined. Must explicitly invoke another constructor
		super(2);		// calls the SUPERCLASS form the INHERITANCE HIERARCHY
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getIntensity() {
		return intensity;
	}

	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}
}
