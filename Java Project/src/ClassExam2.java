
public class ClassExam2 {
	
	public static void main(String[] args) {
		
		Goodstock obj = new Goodstock("A52135", 200);
		System.out.println("��ǰ �ڵ� : " + obj.goodCode + ", ������ : " + obj.stockNum);
		
		obj.addStock(500);
		System.out.println("��ǰ �ڵ� : " + obj.goodCode + ", ������ : " + obj.stockNum);
		
	}
}
