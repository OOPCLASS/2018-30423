package variables;

public class Search1 {

	public static void main(String args[]) {
		int table[]= {10,9,8,7,6,5,4,3,2,1,0};
		int number=9;
		int i;
		boolean find=false;
		for(i=0;i<table.length;i++) {
			if(table[i]==number) {
				find=true;
				break;
			}	
		}
		if(find) {
			System.out.println("The element was found, on the position " + i);
		}
		else {
			System.out.println("The element is not in the array");
		}
	}
}
