package �ּ�;


public class Car {
	String color;
	String gearType;
	int door;
	
//	public Car() {
//		color = "white";	//���⿡�� �ʱ�ȭ�� ����
//		gearType = "Auto";
//		door = 4;
//	}
	
	public Car() {
		this("white", "Auto", 4);	//this() �ٸ� ������(������ �����ε�) ȣ�� (Type�� String, String, int�� ������)
	}
	

//	public Car(String color) {		//���� ���� �ʱ�ȭ
//		this.color = color;
//		gearType = gearType;
//		door = door;
//	}
	
	public Car(String color) {
		this(color, "Auto", 4);		//���� ���� �ʱ�ȭ
	}


	public Car(String color, String gearType, int door) {
		this.color = color;			//this. �ڱ� �ڽ��� ��Ī
		this.gearType = gearType;
		this.door = door;
	}

}