import java.util.ArrayList;

public class Lista2 {
	
	public static void main(String[] args) {
			
		ArrayList<Integer> l = new ArrayList<Integer>();

		l.add(2);
		l.add(27);
		l.add(3);

		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));

		}







		int[][] m = {{1,2},{6},{3,4,5,6}};

		for(int[] elem: m) {
			for(int elem2: elem) {
				System.out.print(elem2);
			}
			System.out.println();

		}







	}








}


