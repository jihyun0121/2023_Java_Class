class  park_while1
{
	public static void main(String[] args) 
	{
		int i;
		i = 1;
		
		while(true)
		{
			if (i > 5)
			{
				break;
			}
			if (i % 2 == 0)
			{
				i++;		
				continue;
			}
			System.out.println("Hello World!" + i);
			i++;			
		}
	}
}
