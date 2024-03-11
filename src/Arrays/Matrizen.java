package Arrays;

public class Matrizen {

	public static void main(String[] args) {
		int [][] array = 	{{1,2,3},
							{4,5,6}};
		
		int [][] array2 = magnify(array,2);
		printMatrix(array2);
	}
	
	public static int [][] magnify(int[][] array, int factor){
				
		int[][] a2 = new int[(array.length*factor)][(array[0].length*factor)]; // Array erstellen
		
				for(int i = 0; i<a2.length; i++) {
					for(int j = 0; j < a2[0].length; j++) {
						a2[i][j] = array[(i/factor)][(j/factor)];
					}
				}
		return a2;
	}
	
	public static void printMatrix(int[][] array) {
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

}
