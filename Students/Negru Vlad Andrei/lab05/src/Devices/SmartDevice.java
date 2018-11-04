package Devices;

import lab05.IdGenerator;

public abstract class SmartDevice {
	private int id;
	private String name;
	private boolean turnedOn;

	SmartDevice()
	{
		this.id = IdGenerator.GenerateId();
	}
	public void turnOn() {
		this.turnedOn = true;
	}

	public int getId() {
		return id;
	}
	public void turnOff() {
		this.turnedOn = false;
	}
	
	public boolean isTurnedOn()
	{
		return this.turnedOn == true;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
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
