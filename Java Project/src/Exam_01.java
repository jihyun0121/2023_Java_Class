class Exam_01 
{
	public static void main(String[] args) 
	{
//		int num;
//		num = (int)17.5; //강제형변환 (손실가능성 有)
		
		char ch = 'A';		//char ch = '\u0041';
		System.out.println(ch);

		int code = (int)ch;
		System.out.println((char)code);
	}
}
