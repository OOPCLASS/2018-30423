package uml.pkg;



public class SmartDevice {
	
	private int id;
    private String name;
    private boolean turnedOn;
     

    SmartDevice()
	{
		this.id = IdGenerator.GenerateId();
	}

    public void turnOn() {
    	
    	System.out.println("The device " + id + " is turned on");
    	
    }
    
    public void turnOff() {
    	System.out.println("The device " + id + " is turned off");
    }
    
    public boolean isTurnedOn() {
    	if(turnedOn)
    	{
    		System.out.println("The " + id + " device is being turned on");
    		return turnedOn;
    	}
    	else
    	{
    		System.out.println("The device " + id + " is being turned off");
    		return turnedOn;
    	}
    }
    	
    	public boolean isTurnedOff() {
        	if(!turnedOn)
        	{
        		System.out.println("The device " + id + " is being turned off");
        		return turnedOn;
        	}
        	else
        	{
        		System.out.println("The device is " + id + " being turned on");
        		return turnedOn;
        	}
    	
    }
    
    public void setName(String name) {
    	
    	this.name=name;
    }
    
    public String getName() {
    	return name;
    	
    }
    
    public String getStatus()
	{
		StringBuilder mySBuilder = new StringBuilder();
		mySBuilder.append("Device with id: ")
			      .append(id)
			      .append(" and name: ")
			      .append(name)
			      .append(" is ");
		if(this.isTurnedOn()) mySBuilder.append("on.");
		else mySBuilder.append("off.");
		return mySBuilder.toString();
	}
    
    
}


