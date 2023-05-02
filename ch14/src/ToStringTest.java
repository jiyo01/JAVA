
class Card{  // page.456 참고
	String kind;
	int number;
	
	Card(){
		this("SAPDE", 1);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	int getNumber() {
		return number;
	}
	
	public String toString() {
		return kind + ", " + number;
	}
	
	Card heartCard() {
//		Card c = new Card("HEART", 2);
//		return c;
		return new Card("HEART",2);
	}
}

public class ToStringTest {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(new Card().toString());
//		System.out.println(c1.toString());
//		System.out.println(c1);
		System.out.println(c2);
		
		int i = c1.getNumber();
		System.out.println(i);
		
		System.out.println(c2.heartCard());

	}
}
