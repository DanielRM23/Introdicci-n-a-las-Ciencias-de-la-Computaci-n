
public class Matrices {
	
	public static void main(String[] args) {
		

		//int[][] m = new int[3][3];
		int[][] m = {{4,5,6}, {1,2}, {5}, {7,7,7,7}, {2,3}};


		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				System.out.print("i:" + i + ", j: " + j);
				System.out.println();
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
}






