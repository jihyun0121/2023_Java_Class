package 주석;


public class Car {
	String color;
	String gearType;
	int door;
	
//	public Car() {
//		color = "white";	//여기에서 초기화도 가능
//		gearType = "Auto";
//		door = 4;
//	}
	
	public Car() {
		this("white", "Auto", 4);	//this() 다른 생성자(생성자 오버로딩) 호출 (Type이 String, String, int인 생성자)
	}
	

//	public Car(String color) {		//색만 직접 초기화
//		this.color = color;
//		gearType = gearType;
//		door = door;
//	}
	
	public Car(String color) {
		this(color, "Auto", 4);		//색만 직접 초기화
	}


	public Car(String color, String gearType, int door) {
		this.color = color;			//this. 자기 자신을 지칭
		this.gearType = gearType;
		this.door = door;
	}

}