package variables;

import java.util.Scanner;

public class Search2 {
	public static void main(String args[]) {
		
		int i=0;
		int j=0;
		int matrix[][]= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		Scanner in= new Scanner(System.in);
		int number=in.nextInt();
		System.out.println("The number that you want to look for in the matrix is "+ number);
		boolean find=false;
		for( i=0;i<matrix.length;i++) {
			for( j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==number) {
					find=true;
					break;
				}
			}
			if(find) {
				break;
			}
		}
		if(find) {
			System.out.println("The number was found on the row "+i+" and collumn "+j );
		}
		else {
			System.out.println("The number is not in the matrix");
		}
	}
}
