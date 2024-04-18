import java.util.Scanner;
class IfExam2 
{
	public static void main(String[] args) 
	{
		int a = 20, b = 10;
		char op = '^';	//	+:43, -:45, *:42, /:47
//		System.out.println(op);

		
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 입력 (+,-,*,/) : ");
//		String op = sc.next();	//string 타입
//
//		if (op.equls("+"))	//레퍼런스는 연산이 불가하므로, 비교연산자 대신 equls 사용
//			System.out.println(a + " + " + b + " = " +(a+b));
//		else if (op = "-")
//			System.out.println(a + " - " + b + " = " +(a-b));
//		else if (op = "*")
//			System.out.println(a + " * " + b + " = " +(a*b));
//		else if (op = "/")
//			System.out.println(a + " / " + b + " = " +(a/b));
//		else
//			System.out.println("사칙연산만 입력해주세요.");
		
		String input = sc.next();
		op = input.charAt(0);

		if (op == '+')
			System.out.println(a + " + " + b + " = " +(a+b));
		else if (op == '-')
			System.out.println(a + " - " + b + " = " +(a-b));
		else if (op == '*')
			System.out.println(a + " * " + b + " = " +(a*b));
		else if (op == '/')
			System.out.println(a + " / " + b + " = " +(a/b));
		else
			System.out.println("사칙연산만 입력해주세요.");
	}
}
