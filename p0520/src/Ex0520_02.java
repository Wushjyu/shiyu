
public class Ex0520_02 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main x: " +d.x);
		
		change(d);
		
		System.out.println("change main x :"+ d.x);
		//

	}
	static void change(Data c) {
		c.x = 250;
		System.out.println("change x :"+c.x);
	}

}
