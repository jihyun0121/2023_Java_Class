
public class CarTest2 {

	public static void main(String[] args) {
		
		Car c1 = new Car();		//�⺻������ ȣ��
		System.out.println("c1�� color =  " + c1.color + ", gearType =  " + c1.gearType + ", door = " + c1.door);
		
		Car c2 = new Car("Red");
		System.out.println("c2�� color =  " + c2.color + ", gearType =  " + c2.gearType + ", door = " + c2.door);
		
		Car c3 = new Car("Yellow", "Stick", 2);
		System.out.println("c3�� color =  " + c3.color + ", gearType =  " + c3.gearType + ", door = " + c3.door);
	}

}
