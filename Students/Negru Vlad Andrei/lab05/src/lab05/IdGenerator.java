package lab05;

public final class IdGenerator {
	private static int count = 0;
	
	private IdGenerator() {
		
	}
	
	public static int GenerateId()
	{
		return count++;
	}
	
}
