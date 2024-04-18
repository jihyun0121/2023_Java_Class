
public class CardMain {

	public static void main(String[] args) {

		Card c1 = new Card();
		c1.kind = "♠";
		c1.number = 3;
		
		Card c2 = new Card();
		c2.kind = "◆";
		c2.number = 9;
		
		Card c3 = new Card();
		c3.kind = "♥";
		c3.number = 7;
		
		Card c4 = new Card();
		c4.kind = "♣";
		c4.number = 10;
		
//		System.out.println("c1" + " " + c1.kind + c1.number + "이며, 크기는("+ Card.width + "," + Card.height + ")");
//		System.out.println("c2" + " " + c2.kind + c2.number + "이며, 크기는("+ Card.width + "," + Card.height + ")");
//		System.out.println("c3" + " " + c3.kind + c3.number + "이며, 크기는("+ Card.width + "," + Card.height + ")");
//		System.out.println("c4" + " " + c4.kind + c4.number + "이며, 크기는("+ Card.width + "," + Card.height + ")");
		System.out.println("c1" + 
						"\n모양 : " + c1.kind + 
						"\n숫자 : " + c1.number + 
						"\n넓이 : " + Card.width + 
						"\n높이 : " + Card.height);
		System.out.println();
		System.out.println("c2" + 
				"\n모양 : " + c2.kind + 
				"\n숫자 : " + c2.number + 
				"\n넓이 : " + Card.width + 
				"\n높이 : " + Card.height);
		System.out.println();
		System.out.println("c3" + 
				"\n모양 : " + c3.kind + 
				"\n숫자 : " + c3.number + 
				"\n넓이 : " + Card.width + 
				"\n높이 : " + Card.height);
		System.out.println();
		System.out.println("c4" + 
				"\n모양 : " + c4.kind + 
				"\n숫자 : " + c4.number + 
				"\n넓이 : " + Card.width + 
				"\n높이 : " + Card.height);
	}

}
