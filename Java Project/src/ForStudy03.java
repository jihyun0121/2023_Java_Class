import java.util.Scanner;

public class ForStudy03 {

	public static void main(String[] args) {
		// (문제) 두 개의 주사위를 던졌을 대, 합이 6이 되는 모든 경우의 수를 출력하고
//		// 그 횟수를 출력하세요
//		
//		int count = 0;
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6; j++) {
//				if ((i + j) == 6) {
//					count++;
//					System.out.println("첫 번째 : " + i + ", " + "두 번째 : " + j);
//				}	//if i
//			}	//for j
//		}	//for i
//		System.out.println("6이 되는 경우의 수 : " + count);
		
		// (문제) 문자형 숫자를 입력받아서, 그 자릿수의 합을 구하시오.
		
		Scanner sc = new Scanner(System.in);		
//		String str = sc.next();
//		int number = 0;
//		for (int i = 0; i < str.length(); i++) {
//			number += (str.charAt(i) - '0');
//		}
//		System.out.println(number);	
		
		// (문제) 정수를 입력받아서 각 자릿수의 합을 구하시오.
		
		int num = sc.nextInt();
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
				
			}
			
		System.out.println(sum);
		sc.close();
	}

}
