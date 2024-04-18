package 주석;


public class MyCar {		//클래스 선언 (교과서 57p)
	//클래스 멤버 : 생성자, 멤버 변수, 메소드
	
	private int speed;		//속도	//private MyCar에서만 사용
	int wheel;		//바퀴
	public String irum;	//이름
	public final static int Handle = 1;	//첫글자 대문자 약속	//final 값을 바꿀 수 없음, 반드시 초기화해야함
	
	//(우클릭 -> source -> Generate constructor using Fields... -> Generate : 생성자 생성)
	//생성자 오버로딩
	public MyCar() {		//기본생성자		//다른 생성자를 만들기 위해 직접 생성
		
	}
	
	public MyCar(int speed) {				//speed만 초기화
		this.speed = speed;
	}
	
	public MyCar(int speed, int wheel) {	//speed와 wheel을 초기화
		this(speed);	//다른 생성자 호출
//		this.speed = speed;
//		this.wheel = wheel;
	}
	
	public MyCar(String irum, int wheel) {	//irum와 wheel을 초기화
		this.irum = irum;
		this.wheel = wheel;
	}

	public MyCar(int wheel, String irum) {
		this.wheel = wheel;
		this.irum = irum;
	}

	public MyCar(int speed, int wheel, String irum) {
		this(speed);			//this.speed = speed;
		this.wheel = wheel;		//this(wheel) 불가, this()하나밖에 못 씀
		this.irum = irum;
	}

	//정보 은닉
	public int getSpeed() {					//private speed 접근 권한 부여
		return speed;
	}
	
	public void setSpeed(int speed) {		//private speed 바꾸기 권한 부여	//void return 없음
		this.speed = speed;
	}
//	
//	//메소드
//	[접근 제어자] 리턴 타입 메소드명([매개변수...]) {	//...생략 가능
//		
//	}
//	
}
