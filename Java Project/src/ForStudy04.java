
public class ForStudy04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {10, 20, 30, 40, 50};
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}	//for
		
		//���� for��
//		for (int num : arr) {
//			System.out.println(num);
//		}
		
		// (����) i��° �Ǻ���ġ ���� ���ϱ�
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int arr[] = new int[num];		
//		
//		int sum, num1, num2;
//		num1 = 1;
//		num2 = 1;
//		sum = 1;
//		System.out.println(num1 + " " + num2);
//		for (int i = 0; i <= (num-2); i++) {
//			System.out.print(sum + " ");
//			sum = num1 + num2;
//			num1 = num2;
//			num2 = sum;
//		}
		
		//(����) 1 ~ 100������ ���� �� 3�� ����̸鼭 ���ÿ� 5�� ����� ���� ������ ������ ���Ͻÿ�.
		int sum = 0, i;
		int num = 0;
		for (i = 1; i <= 100 ; i ++ ) {
		if (i % 3 == 0 && i % 5 ==0) {
		sum += i;
		num++;
				}
			}
		System.out.println("���� = " + num);
		System.out.println("���� = " + sum);
	}

}
