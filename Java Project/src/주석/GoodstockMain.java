package �ּ�;


public class GoodstockMain {

	public static void main(String[] args) {
		Goodstock obj = new Goodstock("A53125", 200);
		
		System.out.println("��ǰ �ڵ� : " + obj.goodCode + ", ������ : " + obj.stockNum);
		
		obj.addStock(1000);			//�԰�
		System.out.println("��ǰ �ڵ� : " + obj.goodCode + ", ������ : " + obj.stockNum);
		
		obj.subtractStock(700);		//���	//stockNum < amount�� ��� ���� ���� �߻�
		System.out.println("��ǰ �ڵ� : " + obj.goodCode + ", ������ : " + obj.stockNum);
	}

}
