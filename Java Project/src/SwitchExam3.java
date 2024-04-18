class  SwitchExam3
{
	public static void main(String[] args) 
	{
		int a = 8;
		switch (a % 3)
		{
			case 0 :
				System.out.println(a + "1" + (a));
				break;
			case 1 :
			case 2 :
				System.out.println(a + "2");
				break;
			default :
				System.out.println("3");
				break;
		}
	}
}
