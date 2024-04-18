package 주석;


public class GoodstockMain {

	public static void main(String[] args) {
		Goodstock obj = new Goodstock("A53125", 200);
		
		System.out.println("상품 코드 : " + obj.goodCode + ", 재고수량 : " + obj.stockNum);
		
		obj.addStock(1000);			//입고
		System.out.println("상품 코드 : " + obj.goodCode + ", 재고수량 : " + obj.stockNum);
		
		obj.subtractStock(700);		//출고	//stockNum < amount일 경우 논리적 오류 발생
		System.out.println("상품 코드 : " + obj.goodCode + ", 재고수량 : " + obj.stockNum);
	}

}
