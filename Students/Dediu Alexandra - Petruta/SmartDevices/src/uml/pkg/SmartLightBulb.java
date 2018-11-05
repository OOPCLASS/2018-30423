package uml.pkg;

public class SmartLightBulb extends SmartDevice{
	private String color;
	private Integer intensity;
	
	public SmartLightBulb() {
		
	}
	
	private String getColor() {
		
		return color;
	}
	
	private void setColor(String color) {
		this.color=color;
	}
	
	private Integer	getIntensity() {
		
		return intensity;
	}

	private void setIntensity(Integer Intensity) {
		
		this.intensity=Intensity;
	}
}
