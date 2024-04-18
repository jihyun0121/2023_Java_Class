
public class WhileStudy04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int count = 1;
		int sum = 0;
		while (i < 100) {
			if (count % 2 == 1) {
				System.out.print(-i + " ");
				sum += -i;
				i++;
			}
			else {
				System.out.print(i);
				sum += i;
			}
			continue;
		}
		System.out.println(sum);
	}

}
