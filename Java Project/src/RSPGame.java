import java.util.Scanner;

public class RSPGame {
	
//	public static final int ���� = 1;
//	public static final int ���� = 2;
//	public static final int �� = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com, you;
		
		while (true) {
			
			com = (int)(Math.random()*3) +1;		// com = 1, 2, 3
//			System.out.println(com);
			System.out.println("1 : ����");
			System.out.println("2 : ����");
			System.out.println("3 : ��");
			System.out.print("���ϴ� ���� �Է��Ͻÿ� : ");
			you = sc.nextInt();
			
			// �ʱ��� �ڽ�
//			if (com == 1) {
//				switch (you) {
//					case 1 :
//						System.out.println("��ǻ�� : ����	����� : ����	���º��Դϴ�!");
//						break;
//					case 2 :
//						System.out.println("��ǻ�� : ����	����� : ����	�¸��ϼ̽��ϴ�!");
//						break;
//					case 3:
//						System.out.println("��ǻ�� : ����	����� : ��	�й��ϼ̽��ϴ�!");
//						break;
//					default :
//						System.out.println("�߸��� �����Դϴ�. 1~3������ ���ڸ� �Է����ּ���");
//				}
//			}
//			else if (com == 2) {
//				switch (you) {
//					case 1 :
//						System.out.println("��ǻ�� : ����	����� : ����	�й��ϼ̽��ϴ�!");
//						break;
//					case 2 :
//						System.out.println("��ǻ�� : ����	����� : ����	���º��Դϴ�!");
//						break;
//					case 3:
//						System.out.println("��ǻ�� : ����	����� : ��		�¸��ϼ̽��ϴ�!");
//						break;
//					default :
//						System.out.println("�߸��� �����Դϴ�. 1~3������ ���ڸ� �Է����ּ���");
//				}				
//			}
//			else {
//				switch (you) {
//					case 1 :
//						System.out.println("��ǻ�� : ��		����� : ����	�¸��ϼ̽��ϴ�!");
//						break;
//					case 2 :
//						System.out.println("��ǻ�� : ��		����� : ����	�й��ϼ̽��ϴ�!");
//						break;
//					case 3:
//						System.out.println("��ǻ�� : ��		����� : ��		���º��Դϴ�!");
//						break;
//					default :
//						System.out.println("�߸��� �����Դϴ�. 1~3������ ���ڸ� �Է����ּ���");
//				}
//			}
			
			// �߱��� �ڽ�
//			switch (com) {
//				case 1 :
//					System.out.println("��ǻ�� : ���� \t");
//					break;
//				case 2 :
//					System.out.println("��ǻ�� : ���� \t");
//					break;
//				case 3 :
//					System.out.println("��ǻ�� : �� \t");
//					break;
//			}	//com
//			switch (you) {
//				case 1 :
//					System.out.println("����� : ���� \t");
//					break;
//				case 2 :
//					System.out.println("����� : ���� \t");
//					break;
//				case 3 :
//					System.out.println("����� : �� \t");
//					break;
//				default:
//					System.out.println("�߸��� �����Դϴ�. 1~3������ ���ڸ� �Է����ּ���");
//			}	//you
			
//			System.out.print("��ǻ�� : " + print(com));
//			System.out.print("����� : " + print(you));
//			
//			if ((you == ���� && com == ��) || (you == ���� && com == ����) || (you == �� && com == ����)) {
//				System.out.println("�¸��ϼ̽��ϴ�!");
//			}
//			else if ((you == ���� && com == ����) || (you == ���� && com == ����) || (you == �� && com == ��)) {
//				System.out.println("���º��Դϴ�!");
//			}
//			else {
//				System.out.println("�й��ϼ̽��ϴ�!");
//			}
			
			// ����� �ڽ�
//			switch (you-com) {
//			case 1:
//			case -2:
//				System.out.println("�¸��ϼ̽��ϴ�!");
//				break;
//			case -1:
//			case 2:
//				System.out.println("�й��ϼ̽��ϴ�!");
//				break;
//			case 0:
//				System.out.println("���º��Դϴ�!");
//				break;
//			default:
//				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//				continue;
//			}	//switch
			
			// �ֻ���� �ڽ�
			switch ((you-com) % 3) {
			case 1:
				System.out.println("�¸��ϼ̽��ϴ�!");
				break;
			case 2:
				System.out.println("�й��ϼ̽��ϴ�!");
				break;
			case 0:
				System.out.println("���º��Դϴ�!");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}	//switch
			
			System.out.print("��� �Ͻðڽ��ϱ�? (y/n) : ");
			String choice = sc.next();
			if (choice.equals("n") || choice.equals("N")) {
				System.out.println("������ �����մϴ�");
				break;
			}	//if
		}	//while
		sc.close();
	}	//main
//	static public String print(int num) {
//		String choice = "";
//		if(num == 2) choice = "���� \t";
//		else if(num == 2) choice = "���� \t";
//		else if(num == 2) choice = "�� \t";
//		return choice;		
//	}	//print
}
