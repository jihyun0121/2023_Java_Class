package 주석;


public class Goodstock {
	String goodCode;	//상품 코드
	int stockNum = 10;	//재고 개수
	
	//생성자 오버로딩
	public Goodstock() {									//기본 생성자
		
	}
	
	public Goodstock(String goodCode, int stockNum) {		//생성자
		this.goodCode = goodCode;
		this.stockNum = stockNum;
	}
	
	//입고
	void addStock(int amount) {
		stockNum += amount;
	}
	
	//출고
	int subtractStock(int amount) {
		if (stockNum < amount) {		//논리적 오류 방지
			return 0;					//stockNum < amount일 경우 0을 return
		}
		stockNum -= amount;
		return stockNum;
	}
}
