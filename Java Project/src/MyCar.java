
public class MyCar {		//Ŭ���� ���� (������ 57p)
	//Ŭ���� ��� : ������, ��� ����, �޼ҵ�
	
	private int speed;		//�ӵ�
	int wheel;		//����
	public String irum;	//�̸�
	public final static int Handle = 1;
	
	//������ �����ε�
	public MyCar() {		//�⺻������
		
	}
	
	public MyCar(int speed) {
		this.speed = speed;
	}
	
	public MyCar(int speed, int wheel) {
		this(speed);
		this.wheel = wheel;
	}
	
	public MyCar(String irum, int wheel) {
		this.irum = irum;
		this.wheel = wheel;
	}

	public MyCar(int wheel, String irum) {
		this.wheel = wheel;
		this.irum = irum;
	}

	public MyCar(int speed, int wheel, String irum) {
		this(speed);			//this.speed = speed;
		this.wheel = wheel;
		this.irum = irum;
	}

	//���� ����
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//�޼ҵ�
	public void display() {
		System.out.println("�̸� : " + this.irum + ", �ӵ� : " + speed + ", ���� ��: " + wheel);
	}
	//�޼ҵ� �����ε�
	public void display(String irum, int speed, int wheel) {
		System.out.println("�̸� : " + this.irum + ", �ӵ� : " + this.speed + ", ���� ��: " + this.wheel);
	}
	
	public static void test() {
		System.out.println("static");
		System.out.println("�ڵ���� " + MyCar.Handle);
	}
}
