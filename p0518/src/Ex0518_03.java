

public class Ex0518_03 {

	public static void main(String[] args) {
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number =7;
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("카드종류:%s, 숫자:%d \n",c1.kind,c1.number);
		System.out.printf("카드폭:%d, 카드길이:%d \n",c1.width,c1.height);
		c1.width=200;
		c1.height =300;
		System.out.println("----------------------------------------");
		System.out.printf("카드종류:%s, 숫자:%d \n",c2.kind,c2.number);
		System.out.printf("카드폭:%d, 카드길이:%d \n",c2.width,c2.height);
		
		
		
		
		
		
		
		//Card.width=50;//클래스변수마 객체 생성되지 않아도 사용할 수 있다.인스턴스는 객체 생성해야돼
		
		

	}

}
