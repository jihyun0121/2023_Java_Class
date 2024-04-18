import java.util.Random;	//Random을 사용하기 위해 import
import java.util.Scanner;	//Scanner를 사용하기 위해 import

class Baseball 
{
	public static void main(String[] args) 
	{
		int f, s, t;		//first, second, third
		int p;				//player
		int p_f, p_s, p_t;	//player_first, player_second, player_third

		int st = 0, ba = 0, out = 0;	//strike, ball, out
		int count = 1;
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		f = random.nextInt(10);
		
		do
		{
			s = random.nextInt(10);
		}
		while (f == s);

		do
		{
			t = random.nextInt(10);
		}
		while ((t == f) || (t == s));
		//일의 자리가 백의 자리와 같거나, 십의 자리와 같으면 계속 반복

		System.out.println("생성된 숫자는 " + f + s + t + "입니다");

		while (true)
		{
			System.out.println("\n3자리 숫자를 입력해 주세요 : ");
			p = sc.nextInt();



			p_f = p / 100;			//백의 자리를 구하는 식
			p_s = (p % 100) / 10;	//십의 자리를 구하는 식
			p_t = p % 10;			//일의 자리를 구하는 식

			if (p_f == f)
				st++;
			else if (p_f == s || p_f == t)
				ba++;
			else
				out++;

			if (p_s == s)
				st++;
			else if (p_s == f || p_s == t)
				ba++;
			else
				out++;

			if (p_t == t)
				st++;
			else if (p_t == s || p_t == f)
				ba++;
			else
				out++;

			if (p_f == p_s || p_f == p_t || p_s == p_t)
			{
				System.out.println("Error");
				continue;
			}

			if (p < 0 || p > 1000 || p < 100)
			{
				System.out.println("Error");
				continue;
			}
				System.out.println("STRIKE : " + st + ", BALL : " + ba + ", OUT : " + out + "입니다");
			
			if (st == 3 || count >=10)
			{
				break;
			}

			st = 0;
			ba = 0;
			out = 0;
			count++;	//횟수 증가
		}

		if (st == 3)
			System.out.println("HOMERUN!" + "no." + count);
		else
			System.out.println("SUBSTITUTION");
	}
}
