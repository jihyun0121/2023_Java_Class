
public class TV_Test1 {

	public static void main(String[] args) {
//		TV tv = new TV();
//		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
//		
//		tv.power();	//power = true
//		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
//		
//		tv.channel = 15;	//������� �ʱ�ȭ
//		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
//		
//		tv.color = "����";	//������� �ʱ�ȭ
//		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
//		
//		tv.channelDown();	//channel = 14
//		tv.channelDown();	//channel = 13
//		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);

		TV tv = new TV("BLACK", true, 15);
		System.out.println(tv.color + " : " + tv.power + " : " + tv.channel);
	}

}
