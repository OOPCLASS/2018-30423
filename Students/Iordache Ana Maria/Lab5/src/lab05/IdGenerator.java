package lab05;

public final class IdGenerator {

	public static int counter = 0;
	
	private IdGenerator() {
		
	}
	
	public static int getNextId() {
		return counter++;
	}
}
