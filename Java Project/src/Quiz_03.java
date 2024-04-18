import java.util.Scanner;
class Quiz_03 
{
   public static void main(String[] args) 
   {
		// (1)영어 소문자, 숫자, 특수문자를 입력 받으면 그대로 출력할것!!
		// (2)영어 대문자가 입력되면 소문자로 변환해서 출력할것!!
		// (3)문자열이 입력되면 첫글자만 변환해서 출력할것!!
		// a -> a, 1 -> 1, $ -> $
		// Choi -> c, choi -> c

		Scanner sc = new Scanner(System.in);
		String input;
		System.out.print("문자 입력 : ");
		input = sc.next();
		char code;

		char ch = input.charAt(0);		// 0이 들어가는 이유는 첫글자만 변환하기 위해

//		if (ch >= 65 && ch <= 90) {		//65 =  a, 90 = z
//			code = (char)(ch + 32);		//32를 더하면 대문자 , 강제형변환
//		}
//		else {
//		code = ch;
//		}

		code = (ch >= 65 && ch <= 90) ? (char)(ch + 32) : ch;	//삼항연산자

		System.out.println("입력한문자 : " + input + ", 변환된문자 : " + code);
   }
}