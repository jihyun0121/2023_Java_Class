import java.util.Scanner;

public class WhileStudy02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while���� �̿��ؼ� 1���� ���� �����Ͽ� �����հ谡 100�� �ѱ�� ���� �� ���� ����Ͻÿ�.
//		int i = 1;
//		int sum = 0;
//		while (sum <= 100) {
//			sum += i;
//			System.out.println(i);
//			i++;
//		}
//		System.out.println(sum);
		
		//����ڷκ��� ������ �ϳ� �Է¹޾Ƽ�, �� ���� ��� ����� ����Ͻÿ�.
		
//		Scanner sc = new Scanner(System.in);
//		int num, i =1;
//		System.out.println("������ �Է��Ͻÿ� : ");
//		num = sc.nextInt();
//		while (num >= i) {
//			if (num % 1 == 0)
//				System.out.println(i);
//			i++;
//		}
		//0~100 ������ ������ ������ ������ �Է¹޾Ƽ�, �Է¹��� ������ ����, �հ�, ����� ���
		//��, 0���� �������� �ԷµǸ� ���α׷��� ����ǰ�,
		//100���� ū ���� �ԷµǸ� ����, �հ�, ��տ��� ������ ��
		Scanner sc = new Scanner(System.in);
		int i;
		int num = 0;
		int sum = 0;
		double avr;
		while (true) {
			System.out.println("���� �Է� : ");
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
		System.out.println( "���� : " + num + " ���� : " + sum + " ��� : " + avr);
		sc.close();
	}

}
