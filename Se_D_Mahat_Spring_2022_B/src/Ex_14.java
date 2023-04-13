
public class Ex_14 {

	public static int witchDimonde(int[][] arr, int x, int y) {

		for (int i = 0; i < arr.length -2; i++)

			for (int j = 1; j < arr[i].length - 2; j++) {

				if (arr[i][j] == arr[x + 1][y + 1])

					if (arr[i][j] == arr[x + 2][y])

						if (arr[i][j] == arr[x + 1][y - 1])

							if (j < arr[i].length / 2)
								return 1;

							else if (j >= arr[i].length / 2)
								return 2;

			}
		return 0;
	}
	
	public static void fillArray (int [][] arr) {
		
	
		
		for (int i=0;i<arr.length;i++)
			
			for (int j=0;j<arr[i].length;j++)
				
				i=1;
				
				
	}

	public static void main(String[] args) {

		//int[][] arr = { { 3, 1, 5, 3, 23, 4 }, { 2, 5 ,2, 6, 8, 4 }, { 22, 2, 6, 24, 6, 2 }, { 9, 9, 7, 6, 33, 1 } };
		
		int [][] arr=new int [30][20];
		
		int x=1,y=10;

		System.out.println(witchDimonde(arr, x, y));

	}

}
