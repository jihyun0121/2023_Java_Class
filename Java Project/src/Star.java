import java.util.Scanner;

class  Star
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.print("숫자를 입력하시오 : ");
		x = sc.nextInt();
		
		for(int i = 1; i < x; i++)
		{
			for(int j = x; j >= 0; j--)
			{
				if(i < j)
				{
				System.out.print(" ");
				}

			else
			{
				System.out.print("*");
			}
			}
			System.out.println("");
		}
	}
}
