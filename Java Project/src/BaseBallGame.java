import java.util.Scanner;
class BaseBallGame 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int c1, c2, c3;
		int h1, h2, h3;
		int s = 0, b = 0;
		int count = 1;

		c1 = (int)(Math.random()*9)+1;
		do
		{
			c2 = (int)(Math.random()*9)+1;
		}
		while (c1 == c2);
		do
		{
			c3 = (int)(Math.random()*9)+1;
		}
		while (c3 == c1 || c3 == c2);
		//System.out.println(c1+" "+c2+" "+c3);

		while (true)
		{
			
			System.out.print("1~9 사이의 숫자 3개 입력 : ");
			h1 = sc.nextInt();
			h2 = sc.nextInt();
			h3 = sc.nextInt();
//			System.out.println(h1+" "+h2+" "+h3);

			if (h1 == c1) s++;
			else if(h1 == c2 || h1 == c3) b++;

			if (h2 == c2) s++;
			else if(h2 == c1 || h2 == c3) b++;
			
			if (h3 == c3) s++;
			else if(h3 == c1 || h3 == c2) b++;

			System.out.println("["+s+"S, "+b+"B]");

			if(s == 3) break;

			s = 0;
			b = 0;
			count++;
		}
		
		System.out.println("정답입니다.");
		System.out.println(count+"회에 맞히셨습니다.");
	}
}
