class ArrayExam1
{
	public static void main(String[] args) 
	{
//		//1. 선언
//			int a[];	//int[] a;

//		//2. 생성
//			a = new int[3];

//		//3. 초기화
//			a[0] = 1;
//			a[1] = 2;
//			a[2] = 3;

//		System.out.println(a.length);		//a의 인덱스 갯수

//		//1. 선언 & 생성
//			int a[] = new int[3];
		
//		//2. 초기화
//			a[0] = 1;
//			a[1] = 2;
//			a[2] = 3;
		
		//1. 선언 & 생성 & 초기화
			int a[] = {1, 2, 3};
			
//			int a[];
//			a = new int[3];		//byte, short, int, long = 0	float, double = 0.0		boolean = false		char = null

//			System.out.println(a[0]);
//			System.out.println(a[1]);
//			System.out.println(a[2]);
			
			for (int i = 0; i < a.length ; i++)		//i < a.length		배열을 사용할때는 초기값은 0, 비교식에는 length
			{
				System.out.println(a[i]);
			}
	}
}