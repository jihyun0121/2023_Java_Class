class ArrayExam9
{
	public static void main(String[] args) 
	{
		int a[];
		int b[];
		int c[] = {31, 32, 33};

		a = new int[4];
		b = new int[]{21, 22, 23, 24};

		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);

		c = b;
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(c.length);

		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[3]);

	}
}
