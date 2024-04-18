import java.util.Scanner;

public class RSPGame {
	
//	public static final int 가위 = 1;
//	public static final int 바위 = 2;
//	public static final int 보 = 3;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int com, you;
		
		while (true) {
			
			com = (int)(Math.random()*3) +1;		// com = 1, 2, 3
//			System.out.println(com);
			System.out.println("1 : 가위");
			System.out.println("2 : 바위");
			System.out.println("3 : 보");
			System.out.print("원하는 값을 입력하시오 : ");
			you = sc.nextInt();
			
			// 초급자 코스
//			if (com == 1) {
//				switch (you) {
//					case 1 :
//						System.out.println("컴퓨터 : 가위	사용자 : 가위	무승부입니다!");
//						break;
//					case 2 :
//						System.out.println("컴퓨터 : 가위	사용자 : 바위	승리하셨습니다!");
//						break;
//					case 3:
//						System.out.println("컴퓨터 : 가위	사용자 : 보	패배하셨습니다!");
//						break;
//					default :
//						System.out.println("잘못된 숫자입니다. 1~3까지의 숫자만 입력해주세요");
//				}
//			}
//			else if (com == 2) {
//				switch (you) {
//					case 1 :
//						System.out.println("컴퓨터 : 바위	사용자 : 가위	패배하셨습니다!");
//						break;
//					case 2 :
//						System.out.println("컴퓨터 : 바위	사용자 : 바위	무승부입니다!");
//						break;
//					case 3:
//						System.out.println("컴퓨터 : 바위	사용자 : 보		승리하셨습니다!");
//						break;
//					default :
//						System.out.println("잘못된 숫자입니다. 1~3까지의 숫자만 입력해주세요");
//				}				
//			}
//			else {
//				switch (you) {
//					case 1 :
//						System.out.println("컴퓨터 : 보		사용자 : 가위	승리하셨습니다!");
//						break;
//					case 2 :
//						System.out.println("컴퓨터 : 보		사용자 : 바위	패배하셨습니다!");
//						break;
//					case 3:
//						System.out.println("컴퓨터 : 보		사용자 : 보		무승부입니다!");
//						break;
//					default :
//						System.out.println("잘못된 숫자입니다. 1~3까지의 숫자만 입력해주세요");
//				}
//			}
			
			// 중급자 코스
//			switch (com) {
//				case 1 :
//					System.out.println("컴퓨터 : 가위 \t");
//					break;
//				case 2 :
//					System.out.println("컴퓨터 : 바위 \t");
//					break;
//				case 3 :
//					System.out.println("컴퓨터 : 보 \t");
//					break;
//			}	//com
//			switch (you) {
//				case 1 :
//					System.out.println("사용자 : 가위 \t");
//					break;
//				case 2 :
//					System.out.println("사용자 : 바위 \t");
//					break;
//				case 3 :
//					System.out.println("사용자 : 보 \t");
//					break;
//				default:
//					System.out.println("잘못된 숫자입니다. 1~3까지의 숫자만 입력해주세요");
//			}	//you
			
//			System.out.print("컴퓨터 : " + print(com));
//			System.out.print("사용자 : " + print(you));
//			
//			if ((you == 가위 && com == 보) || (you == 바위 && com == 가위) || (you == 보 && com == 바위)) {
//				System.out.println("승리하셨습니다!");
//			}
//			else if ((you == 가위 && com == 가위) || (you == 바위 && com == 바위) || (you == 보 && com == 보)) {
//				System.out.println("무승부입니다!");
//			}
//			else {
//				System.out.println("패배하셨습니다!");
//			}
			
			// 상급자 코스
//			switch (you-com) {
//			case 1:
//			case -2:
//				System.out.println("승리하셨습니다!");
//				break;
//			case -1:
//			case 2:
//				System.out.println("패배하셨습니다!");
//				break;
//			case 0:
//				System.out.println("무승부입니다!");
//				break;
//			default:
//				System.out.println("잘못 입력하셨습니다.");
//				continue;
//			}	//switch
			
			// 최상급자 코스
			switch ((you-com) % 3) {
			case 1:
				System.out.println("승리하셨습니다!");
				break;
			case 2:
				System.out.println("패배하셨습니다!");
				break;
			case 0:
				System.out.println("무승부입니다!");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}	//switch
			
			System.out.print("계속 하시겠습니까? (y/n) : ");
			String choice = sc.next();
			if (choice.equals("n") || choice.equals("N")) {
				System.out.println("게임을 종료합니다");
				break;
			}	//if
		}	//while
		sc.close();
	}	//main
//	static public String print(int num) {
//		String choice = "";
//		if(num == 2) choice = "가위 \t";
//		else if(num == 2) choice = "바위 \t";
//		else if(num == 2) choice = "보 \t";
//		return choice;		
//	}	//print
}
