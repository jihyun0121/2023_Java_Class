package �ּ�;


public class CarTest {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "Auto";
		c1.door = 4;
		
		System.out.println("c1�� color =  " + c1.color + ", gearType =  " + c1.gearType + ", door = " + c1.door);
		
		Car c2 = new Car("white", "Auto", 4);
		System.out.println("c2�� color =  " + c2.color + ", gearType =  " + c2.gearType + ", door = " + c2.door);
		

	}

}
