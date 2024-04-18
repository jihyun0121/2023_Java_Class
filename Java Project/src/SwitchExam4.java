class  SwitchExam4
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
//		System.out.println(a);

		switch (a)
		{
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(a + "a");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println(a + "b");
			break;
		case 2 :
			System.out.println(a + "c");
			break;
		default :
			System.out.println("1 ~ 12 ����留� ���ν������");
		}
	}
}
