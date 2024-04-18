import java.util.Scanner;

public class ArrayStudy07 {

	public static void main(String[] args) {
		
		int score[] = new int[7];
		int max = score[0];
		int min = score[0];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			if (i == 0)
				min = score[i];
			if (max < score[i])
				max = score[i];
			if (min > score[i])
				min = score[i];
		}	//for
			System.out.println("원본 데이터 : ");
			for (int i = 0; i < score.length; i++) {
				System.out.println(score[i] + "\t");
			}
			System.out.println();
			System.out.println("최대값 = " + max);
			System.out.println("최솟값 = " + min);
		
		sc.close();
	}

}
