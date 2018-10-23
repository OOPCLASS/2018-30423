package oop.first.pkg;

public class Station {

	
	private String name;
	private String city;
	private int indexOfBus = 0;
	private final int maxNumber = 4;
	
	private Bus[] bus = new Bus[maxNumber];
	
	public void addBus(Bus bus) {
		if (indexOfBus < maxNumber) {
			this.bus[indexOfBus] = bus;
			indexOfBus++;
		}
		
	}
	
	public Station() {
		
	}
	
	public Station(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getIndexOfBus() {
		return indexOfBus;
	}

	public void setIndexOfBus(int indexOfBus) {
		this.indexOfBus = indexOfBus;
	}

	public Bus[] getBus() {
		return bus;
	}
	
	

	public void setBus(Bus[] bus) {
		this.bus = bus;
	}
}
