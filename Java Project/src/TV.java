//Ŭ���� �����
public class TV {
	//Ŭ���� ��� : ������, �������(=��������), �޼ҵ�
	String color;
	boolean power;
	int channel;
	
	//������ �����ε�
	public TV() {}	//�⺻ ������ (�Ű������� ����)
	
	public TV(String color, boolean power, int channel) {	//������
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
