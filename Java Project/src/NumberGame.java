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
			System.out.println("1부터 100까지의 수 중 하나 입력 :");
			int pc = sc.nextInt();
			if (com < pc) {
				System.out.println("작음");
			}
			else if (pc > com) {
				System.out.println("큼");
				continue;
			}
			else {
				System.out.println("정답");
				break;
			}
		}
		System.out.println();
		System.out.println(count + "번");
		
		if (count <= 4)
			System.out.println("great");
		else if (count <= 8)
			System.out.println("good");
		else
			System.out.println("노력하세요");
		sc.close();
	}

}
