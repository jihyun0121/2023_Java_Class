class ArrayExam10 
{
	public static void main(String[] args) 
	{
//		int a[][];
////		int[][] a;
////		int[] a[];
//
//		a = new int[2][3];
//		
//		a[0][0] = 1;
//		a[0][1] = 2;
//		a[0][2] = 3;
//		a[1][0] = 4;
//		a[1][1] = 5;
//		a[1][2] = 6;
//		
	

		int a[][] = { {1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20} };

		for (int i = 0; i < a.length; i++)		//1 = 0, 1
		{
			for (int j = 0; j < a[i].length; j++)		//j = 0, 1, 2
			{
//				System.out.print("[ " + j + " ] " + "[ " + i + " ] ");
				System.out.print(a[i][j] + "	");
			}
			System.out.println();
		}
	}
}
