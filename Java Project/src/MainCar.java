
public class MainCar {

	public static void main(String[] args) {
		
		MyCar c1 = new MyCar();
		
		c1.setSpeed(100);

		System.out.println(c1.getSpeed());
		
		System.out.println();
		System.out.println("===== 생성자 오버로딩 =====");
		
		MyCar choi = new MyCar();
		choi.display();
		
		MyCar jinho = new MyCar(200);
		jinho.display();
		jinho.display("람보르기니", 250, 4);
		
		MyCar seungho = new MyCar("BMW", 4);
		seungho.display();
		
		MyCar jihyang = new MyCar(300, 6);
		jihyang.display();
		
		jihyang.display("벤츠", 500, 4);
		
		MyCar.test();
	}

}
