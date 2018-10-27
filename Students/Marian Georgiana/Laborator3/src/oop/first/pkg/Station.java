package oop.first.pkg;

public class Station {
	private String name;
	private Bus[] bus; 
	private int capacity;
	private int numberOfBusses;
	
	public Station(String name, int capacity)
	{
		this.name = name;
		this.capacity = capacity;
		this.bus = new Bus[capacity];
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getNumberOfBusses()
	{
		return this.getNumberOfBusses();
	}
	
	public void addBus(Bus bus)
	{
		this.numberOfBusses++;
		this.bus[this.numberOfBusses] = bus;
	}
	
	public boolean removeBus(Bus bus)
	{
		int found = 0;
		for(int i=0; i<this.numberOfBusses; i++)
		{
			if(bus == this.bus[i])
			{
				found = 1;
				this.numberOfBusses--;
				for(int j=i; j<this.numberOfBusses; j++)
				{
					this.bus[j] = this.bus[j+1];
				}
			}
		}
		if(found == 0)
		{
			System.out.println("Bus not in station.");
			return false;
		}
		return true;			
	}
	
	public void printBus()
	{
		if(this.numberOfBusses == 0)
		{
			System.out.println("Station is empty");
		}
		for(int i = 0; i < this.numberOfBusses; i++)
		{
			System.out.println("Bus" + bus[i].toString() + "is in station" );
		}
	}
	

}
