import java.util.Scanner; //스캐너를 사용하기 위해 작성

class park_if1 
{
	public static void main(String[] args) 
	{
		char input;
		Scanner sc = new Scanner(System.in); //스캐너 선언

		System.out.print("Y / N? : ");
		input = sc.next().charAt(0);
		
		if (input == 'Y' || input == 'y')
		{
			System.out.println("execution");
		}
		else if (input == 'N' || input == 'y')
		{
			System.out.println("stop");
		}
		else
		{
			System.out.println("error");
		}
	}
}
