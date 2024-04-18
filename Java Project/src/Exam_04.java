class Exam_04 
{
	public static void main(String[] args) 
	{
//		char ch = 'A';
//		int code = ch + 1;
//		System.out.println(code);
//		System.out.println((char)code);

//		char ch1 = 'A';
//		char ch2 = 'Z';
//		for(int i=ch1; i<=ch2; i++) {
//			System.out.print((char)i);
//		}

		char ch1 = 'A';
		char ch2 = 'Z';
		
		for(int i=ch1; i<=ch2; i++) {
			for(int j=ch1; j<=i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}

		for(int i=ch1; i<=ch2; i++) {
			for(int j=i; j<=ch2; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}

	}
}
