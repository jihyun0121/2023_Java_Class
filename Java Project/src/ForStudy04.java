
public class ForStudy04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {10, 20, 30, 40, 50};
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}	//for
		
		//향상된 for문
//		for (int num : arr) {
//			System.out.println(num);
//		}
		
		// (문제) i번째 피보나치 수열 구하기
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
		
		//(문제) 1 ~ 100사이의 숫자 중 3의 배수이면서 동시에 5의 배수인 수의 갯수와 총합을 구하시오.
		int sum = 0, i;
		int num = 0;
		for (i = 1; i <= 100 ; i ++ ) {
		if (i % 3 == 0 && i % 5 ==0) {
		sum += i;
		num++;
				}
			}
		System.out.println("개수 = " + num);
		System.out.println("총합 = " + sum);
	}

}
