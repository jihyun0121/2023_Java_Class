
public class MyCar {		//클래스 선언 (교과서 57p)
	//클래스 멤버 : 생성자, 멤버 변수, 메소드
	
	private int speed;		//속도
	int wheel;		//바퀴
	public String irum;	//이름
	public final static int Handle = 1;
	
	//생성자 오버로딩
	public MyCar() {		//기본생성자
		
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

	//정보 은닉
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//메소드
	public void display() {
		System.out.println("이름 : " + this.irum + ", 속도 : " + speed + ", 바퀴 수: " + wheel);
	}
	//메소드 오버로딩
	public void display(String irum, int speed, int wheel) {
		System.out.println("이름 : " + this.irum + ", 속도 : " + this.speed + ", 바퀴 수: " + this.wheel);
	}
	
	public static void test() {
		System.out.println("static");
		System.out.println("핸들수는 " + MyCar.Handle);
	}
}
