class Array_Study_04 
{
	public static void main(String[] args) 
	{
//		int table[][] = new int[3][4];
//		table[0][0] = 10;
//		table[1][1] = 20;
//		table[2][3] = table[0][0] + table[1][1];
//		
//		
//		System.out.println(table[0][0]);
//		System.out.println(table[1][1]);
//		System.out.println(table[2][3]);

		int table [][] = { {1}, {2,3}, {4,5,6,7,8} };
		for (int i = 0; i < table.length; i++) {			//i = 0, 1, 2
			for (int j = 0; j < table[i].length; j++) {		//j = 0, 1, 2, 3, 4			//서술형, 객관식, 수행평가
//				System.out.println(i + " " + j);
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
	}
}
