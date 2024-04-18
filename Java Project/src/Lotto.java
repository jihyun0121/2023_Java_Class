public class Lotto {

	public static void main(String[] args) {
		int count = 10000;	//�鸸��
		int lotto[] = new int[7];	//��÷��ȣ 6�� + ���ʽ���ȣ 1��
		int human[] = new int[6];
		int lucky = 0;	//���� ������ ����
		int lucky_b = 0;	//���ʽ� ��ȣ
		int rank1 = 0, rank2 = 0,rank3 = 0, rank4 = 0, rank5 = 0;
		
		//��÷��ȣ
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45) + 1;
			for (int j = 0; j < i; j++) {	//j = 0, 1, 2
				if (lotto[i] == lotto[j]) {
				i--;
				break;
				}	//if
			}	//j
		}	//for i
		
		//�߰���Ȯ��
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}
		
		for (int k = 1; k <= count; k++) {
			System.out.printf("[�� %5d ȸ] : ", k);
			for (int i = 0; i < 6; i++) {
				System.out.print(lotto[i] + " ");
			}	//i
			System.out.printf("[%2d]\t", lotto[6]);
			
			//����� ���� ��ȣ
			for (int i = 0; i < human.length; i++) {
				human[i] = (int)(Math.random()*45) + 1;
				for (int j = 0; j < i; j++) {	//j = 0, 1, 2
					if (human[i] == human[j]) {
					i--;
					break;
					}	//if
					else if (human[i] != lotto[i] && j == 5) {
						System.out.printf("%2d ", human[i]);
					}	//else if
				}	//j
			}	//i
			
			// ���ʽ� ��ȣȮ��
			int i1;
			for (i1 = 0; i1 < human.length; i1++) {
				if (lotto[6] == human[i1]) {
					lucky_b = 1;
					break;
				}	//if
			}	//i1
			
			switch (lucky) {
			case 6:
				System.out.println("*****1�� ��÷!*****");
				rank1++;
				break;
			case 5:
				if (lucky_b == 1) {
					System.out.print("[ 2�� ]");
					rank2++;
					break;
				}
				else {
					System.out.print("[ 3�� ]");
					rank3++;
					break;
				}
			case 4:
				System.out.print("[ 4�� ]");
				rank4++;
				break;
			case 3:
				System.out.print("[ 5�� ]");
				rank5++;
				break;
			default :
				System.out.print("[ �� ]");
				break;
			}
			
			lucky = 0;
			for (int i = 0; i < human.length; i++) {
				for (int j = 0; j < 6; j++) {
					if (human[i] == lotto[j]) {
						lucky++;
//						System.out.printf("%2d ", human[i]);
						break;
					}	//if
				}	//j
			}	//i

//			System.out.print("	" + lucky + "�� ��ġ");
			System.out.println();
		}	//k
			System.out.println("�� ����Ƚ�� " + count+ "ȸ");
			System.out.println("1�� " + rank1 + "ȸ");
			System.out.println("2�� " + rank2 + "ȸ");
			System.out.println("3�� " + rank3 + "ȸ");
			System.out.println("4�� " + rank4 + "ȸ");
			System.out.println("5�� " + rank5 + "ȸ");
	}

}
