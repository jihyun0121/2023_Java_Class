
public class TV_Test3 {

	public static void main(String[] args) {
		
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		System.out.println("tv1�� channel ���� " + tv1.channel + "�Դϴ�.");
		System.out.println("tv2�� channel ���� " + tv2.channel + "�Դϴ�.");
		System.out.println();
		
		// Call by Reference
		tv2 = tv1;
//		tv1.channel = 24;
		tv2.channel = 23;
		
		System.out.println("tv1�� channel ���� " + tv1.channel + "�Դϴ�.");
		System.out.println("tv2�� channel ���� " + tv2.channel + "�Դϴ�.");
		System.out.println();

	}

}
