
public class TV_Test2 {

	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		
		System.out.println("tv1�� channel ���� " + tv1.channel + "�Դϴ�.");
		System.out.println("tv2�� channel ���� " + tv2.channel + "�Դϴ�.");
		
		tv1.channel = 7;
		System.out.println("tv1�� channel ���� " + tv1.channel + "�Դϴ�.");
		System.out.println("tv2�� channel ���� " + tv2.channel + "�Դϴ�.");
		
	}

}
