package Array;
//print all elements of java using loop 
public class printElement {
	public static void main(String args[]) {
	int[][] ab = {
			{1,32,5,9}, 
			{56,89,35},
			{46},
			};
	
	for(int i = 0; i<ab.length; ++i) {
	for(int j = 0; j<ab[i].length; ++j) {
	System.out.println(ab[i][j]);
	}
	}
}

}
