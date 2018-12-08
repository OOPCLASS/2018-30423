package station.pkg;

import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;

public class StationTest {

	@Test
	public void test() {
		int numberOfBusses;
		System.out.println("How many busses?");
		Scanner scan= new Scanner(System.in);
		numberOfBusses=Integer.parseInt(scan.nextLine());
		System.out.println("There are " + numberOfBusses +" busses");
		for(int i=1; i<=numberOfBusses;i++) {
			Station bus= new Station();
			String input;
			int inputInt;
			System.out.println("Brand\n");
			Scanner scanner=new Scanner(System.in);
			String text=scanner.nextLine();
			bus.setBrand(text);
			System.out.println("Color\n");
			String text1=scanner.nextLine();
			bus.setColor(text1);
			System.out.println("Finish station\n");
			String text2=scanner.nextLine();
			bus.setFinishStationName(text2);
			System.out.println("Number Of seats\n");
			inputInt=Integer.parseInt(scan.nextLine());
			bus.setNumberOfSeats(inputInt);
			System.out.println("Start station\n");
			//Scanner scanner3=new Scanner(System.in);
			String text3=scanner.nextLine();
			bus.setStartStationName(text3);
			System.out.println("Bus number " + i);
			System.out.println(bus.getBrand());
			System.out.println(bus.getColor());
			System.out.println(bus.getNumberOfSeats());
			System.out.println(bus.getFinishStationName());
			System.out.println(bus.getStartStationName());
			System.out.println("\n");
			
		}
	}

}
