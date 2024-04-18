//클래스 선언부
public class TV {
	//클래스 멤버 : 생성자, 멤버변수(=전역변수), 메소드
	String color;
	boolean power;
	int channel;
	
	//생성자 오버로딩
	public TV() {}	//기본 생성자 (매개변수가 없음)
	
	public TV(String color, boolean power, int channel) {	//생성자
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	void power() {	//toggle Key
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
