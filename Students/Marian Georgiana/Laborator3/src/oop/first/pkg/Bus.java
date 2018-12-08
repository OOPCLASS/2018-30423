package oop.first.pkg;

public class Bus {
	
	//ENCAPSULATION 
	
	private int number;
	private String brand;
	private String color;
	private int noOfSeats = 52;
	public int publicVariable = 12;

	/**
	 * Constructor
	 */
	public Bus() //must be same name as class, HAS NO RETURN TYPE
	{
		System.out.println("Creating a bus");
		this.brand = "def-br";
		this.color = "def-col";
		this.noOfSeats = 52;
	}
	
	public Bus(String brand) //must be same name as class, HAS NO RETURN TYPE
	{
		this.brand = brand;
	}
	
	public Bus(String brand, String color, int noOfSeats, int number)
	{
		this.brand = brand;
		this.color = color;
		this.noOfSeats = noOfSeats;
		this.number = number;
	}


	
	public void drive(String sourceCity, String destinationCity)
	{
		if(this.brand.equals("Mercedes"))
		System.out.println("I'm driving from " + sourceCity + " to " + destinationCity);
		else
			System.out.println("I'm driving from ");
			//privateMethod(); //can call in same class
	}
	
	/**
	 * Private method, can be accessed just in the class
	 */
	private void privateMethod()
	{
		brand = "ICARUS";
	}
	
	/**
	 * Returns the name of the brand (private var)
	 * @return
	 */
	public String getBrand()
	{
		return brand;
	}
	
	/**
	 * Sets the name of the brand (private var)
	 * @param brand
	 */
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public int getNumberOfSeats()
	{
		return noOfSeats;
	}
	
	public void setNumberOfSeats(int noOfSeats)
	{
		this.noOfSeats = noOfSeats;
	}
	
	public void setColor ( String color)
	{
		this.color = color;
	}

	public void print()
	{
		System.out.println("I'm bus number " + this.number + " and my specs are: brand: " + this.brand + " color: " + this.color + " numberOfSeats: " + this.noOfSeats);
	}
}
