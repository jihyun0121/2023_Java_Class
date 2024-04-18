
public class ClassExam2 {
	
	public static void main(String[] args) {
		
		Goodstock obj = new Goodstock("A52135", 200);
		System.out.println("상품 코드 : " + obj.goodCode + ", 재고수량 : " + obj.stockNum);
		
		obj.addStock(500);
		System.out.println("상품 코드 : " + obj.goodCode + ", 재고수량 : " + obj.stockNum);
		
	}
}
