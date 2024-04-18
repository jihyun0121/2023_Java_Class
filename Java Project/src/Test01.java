import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("헬로우 자바");
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해 주세요 : ");
		String name = sc.next();
		System.out.println("당신의 이름은 " + name + " 입니다.");
		sc.close();
	}

}