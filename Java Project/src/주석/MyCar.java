package �ּ�;


public class MyCar {		//Ŭ���� ���� (������ 57p)
	//Ŭ���� ��� : ������, ��� ����, �޼ҵ�
	
	private int speed;		//�ӵ�	//private MyCar������ ���
	int wheel;		//����
	public String irum;	//�̸�
	public final static int Handle = 1;	//ù���� �빮�� ���	//final ���� �ٲ� �� ����, �ݵ�� �ʱ�ȭ�ؾ���
	
	//(��Ŭ�� -> source -> Generate constructor using Fields... -> Generate : ������ ����)
	//������ �����ε�
	public MyCar() {		//�⺻������		//�ٸ� �����ڸ� ����� ���� ���� ����
		
	}
	
	public MyCar(int speed) {				//speed�� �ʱ�ȭ
		this.speed = speed;
	}
	
	public MyCar(int speed, int wheel) {	//speed�� wheel�� �ʱ�ȭ
		this(speed);	//�ٸ� ������ ȣ��
//		this.speed = speed;
//		this.wheel = wheel;
	}
	
	public MyCar(String irum, int wheel) {	//irum�� wheel�� �ʱ�ȭ
		this.irum = irum;
		this.wheel = wheel;
	}

	public MyCar(int wheel, String irum) {
		this.wheel = wheel;
		this.irum = irum;
	}

	public MyCar(int speed, int wheel, String irum) {
		this(speed);			//this.speed = speed;
		this.wheel = wheel;		//this(wheel) �Ұ�, this()�ϳ��ۿ� �� ��
		this.irum = irum;
	}

	//���� ����
	public int getSpeed() {					//private speed ���� ���� �ο�
		return speed;
	}
	
	public void setSpeed(int speed) {		//private speed �ٲٱ� ���� �ο�	//void return ����
		this.speed = speed;
	}
//	
//	//�޼ҵ�
//	[���� ������] ���� Ÿ�� �޼ҵ��([�Ű�����...]) {	//...���� ����
//		
//	}
//	
}
