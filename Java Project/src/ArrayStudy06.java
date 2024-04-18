import java.util.Scanner;

public class ArrayStudy06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str[] = new String[5];
		
		for (int i = 0; i < str.length; i++) {
			System.out.print((i + 1) + "번 연예인 이름 : ");
			str[i] = sc.next();
			
		}
		for (int i = 0; i < str.length; i++) {
			if ((i + 1) % 2 == 0) {
				System.out.println(str[i]);
			}
				
			}
		sc.close();
		}
	}

