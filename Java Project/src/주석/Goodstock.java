package �ּ�;


public class Goodstock {
	String goodCode;	//��ǰ �ڵ�
	int stockNum = 10;	//��� ����
	
	//������ �����ε�
	public Goodstock() {									//�⺻ ������
		
	}
	
	public Goodstock(String goodCode, int stockNum) {		//������
		this.goodCode = goodCode;
		this.stockNum = stockNum;
	}
	
	//�԰�
	void addStock(int amount) {
		stockNum += amount;
	}
	
	//���
	int subtractStock(int amount) {
		if (stockNum < amount) {		//���� ���� ����
			return 0;					//stockNum < amount�� ��� 0�� return
		}
		stockNum -= amount;
		return stockNum;
	}
}
