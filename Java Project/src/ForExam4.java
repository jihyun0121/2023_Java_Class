class ForExam4 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++)
		{
			System.out.print("i = " + i + "\t");
			for (int j = 1; j <= 5; j++)
			{
//				System.out.println(" ( " + i + " , " + j + " ) ");
				System.out.print(j + " ");
			}	//for j
			System.out.println();
		}	//for i
	}
}
