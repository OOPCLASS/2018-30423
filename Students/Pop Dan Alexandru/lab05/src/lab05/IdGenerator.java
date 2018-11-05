package lab05;
 
public final class IdGenerator {

	public static int counter = 0;

	private int id;
	
	private void IdGenerator() {
		for (id = 0; id < counter; id++) {
		//	this.id = id;
			System.out.println(id);
		}
	} // Syntax error, insert "}" to complete ClassBody

	public static int IdGenerator(static counter) {
		// error for parameter 'counter': ' Syntax error, insert "... VariableDeclaratorId" to complete FormalParameterList '
		this.counter++;
	}
	
}	// 'Syntax error on token "}", delete this token'

// I tried to write this class as you suggested us in the lab.