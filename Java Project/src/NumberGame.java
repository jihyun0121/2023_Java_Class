import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random() * 100 )+ 1;
		System.out.println(com);
		int count = 0;
		
		while(true) {
			count++;
			System.out.println("1���� 100������ �� �� �ϳ� �Է� :");
			int pc = sc.nextInt();
			if (com < pc) {
				System.out.println("����");
			}
			else if (pc > com) {
				System.out.println("ŭ");
				continue;
			}
			else {
				System.out.println("����");
				break;
			}
		}
		System.out.println();
		System.out.println(count + "��");
		
		if (count <= 4)
			System.out.println("great");
		else if (count <= 8)
			System.out.println("good");
		else
			System.out.println("����ϼ���");
		sc.close();
	}

}
