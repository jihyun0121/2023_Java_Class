import java.util.Scanner;

public class ForStudy03 {

	public static void main(String[] args) {
		// (����) �� ���� �ֻ����� ������ ��, ���� 6�� �Ǵ� ��� ����� ���� ����ϰ�
//		// �� Ƚ���� ����ϼ���
//		
//		int count = 0;
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6; j++) {
//				if ((i + j) == 6) {
//					count++;
//					System.out.println("ù ��° : " + i + ", " + "�� ��° : " + j);
//				}	//if i
//			}	//for j
//		}	//for i
//		System.out.println("6�� �Ǵ� ����� �� : " + count);
		
		// (����) ������ ���ڸ� �Է¹޾Ƽ�, �� �ڸ����� ���� ���Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);		
//		String str = sc.next();
//		int number = 0;
//		for (int i = 0; i < str.length(); i++) {
//			number += (str.charAt(i) - '0');
//		}
//		System.out.println(number);	
		
		// (����) ������ �Է¹޾Ƽ� �� �ڸ����� ���� ���Ͻÿ�.
		
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
