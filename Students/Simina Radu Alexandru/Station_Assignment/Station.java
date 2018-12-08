
public class Station {

	private Bus[] busses;
	public Station(int a) {
		busses = new Bus[a];
	}

	public void addBus(Bus b) {
		busses[b.getNumber()] = b;
		
	}
	
	public void removeBus(Bus c) {
		busses[c.getNumber()] = null;
	}
	
	public int countBus() {
		int count = 0;
		for (int i = 0 ; i < busses.length ; i++ ) {
			if (busses[i] != null ) {
				count++;
			}
		}
		return count;
	}
	
	public void listBus() {
		
		for (int i = 0 ; i < busses.length ; i++ ) {
			if (busses[i] != null)
				System.out.println(busses[i]);
		}
	}
}
