import java.util.Scanner;

public class WhileStudy02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문을 이용해서 1부터 값을 누적하여 누적합계가 100을 넘기는 수와 그 합을 출력하시오.
//		int i = 1;
//		int sum = 0;
//		while (sum <= 100) {
//			sum += i;
//			System.out.println(i);
//			i++;
//		}
//		System.out.println(sum);
		
		//사용자로부터 정수를 하나 입력받아서, 그 수의 모든 약수를 출력하시오.
		
//		Scanner sc = new Scanner(System.in);
//		int num, i =1;
//		System.out.println("정수를 입력하시오 : ");
//		num = sc.nextInt();
//		while (num >= i) {
//			if (num % 1 == 0)
//				System.out.println(i);
//			i++;
//		}
		//0~100 사이의 임의의 정수를 여러개 입력받아서, 입력받은 정수의 갯수, 합계, 평균을 출력
		//단, 0보다 작은값이 입력되면 프로그램은 종료되고,
		//100보다 큰 값이 입력되면 갯수, 합계, 평균에서 제외할 것
		Scanner sc = new Scanner(System.in);
		int i;
		int num = 0;
		int sum = 0;
		double avr;
		while (true) {
			System.out.println("정수 입력 : ");
			i = sc.nextInt();
			
			if (i < 0)
				break;
			else if (i > 100) {
				continue;
			}
			else {
				num++;
			}
			sum += i;
		}//while
		avr = sum / (double)num;
		System.out.println( "갯수 : " + num + " 총합 : " + sum + " 평균 : " + avr);
		sc.close();
	}

}
