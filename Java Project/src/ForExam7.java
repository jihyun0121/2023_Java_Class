class  ForExam7
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++)
		{
//			System.out.println(i);
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
//		System.out.println("i값 = " + i);

		for (int i = 5; i >= 1; i--)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println("");
		}
	}
}
