
public class CardMain {

	public static void main(String[] args) {

		Card c1 = new Card();
		c1.kind = "��";
		c1.number = 3;
		
		Card c2 = new Card();
		c2.kind = "��";
		c2.number = 9;
		
		Card c3 = new Card();
		c3.kind = "��";
		c3.number = 7;
		
		Card c4 = new Card();
		c4.kind = "��";
		c4.number = 10;
		
//		System.out.println("c1" + " " + c1.kind + c1.number + "�̸�, ũ���("+ Card.width + "," + Card.height + ")");
//		System.out.println("c2" + " " + c2.kind + c2.number + "�̸�, ũ���("+ Card.width + "," + Card.height + ")");
//		System.out.println("c3" + " " + c3.kind + c3.number + "�̸�, ũ���("+ Card.width + "," + Card.height + ")");
//		System.out.println("c4" + " " + c4.kind + c4.number + "�̸�, ũ���("+ Card.width + "," + Card.height + ")");
		System.out.println("c1" + 
						"\n��� : " + c1.kind + 
						"\n���� : " + c1.number + 
						"\n���� : " + Card.width + 
						"\n���� : " + Card.height);
		System.out.println();
		System.out.println("c2" + 
				"\n��� : " + c2.kind + 
				"\n���� : " + c2.number + 
				"\n���� : " + Card.width + 
				"\n���� : " + Card.height);
		System.out.println();
		System.out.println("c3" + 
				"\n��� : " + c3.kind + 
				"\n���� : " + c3.number + 
				"\n���� : " + Card.width + 
				"\n���� : " + Card.height);
		System.out.println();
		System.out.println("c4" + 
				"\n��� : " + c4.kind + 
				"\n���� : " + c4.number + 
				"\n���� : " + Card.width + 
				"\n���� : " + Card.height);
	}

}
