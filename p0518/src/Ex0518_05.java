import java.util.Scanner;

public class Ex0518_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두수를 입력하세여");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int result = add(num1,num2);//결과값
		

		//System.out.println("데이터 : "+ result);
		System.out.println("데이터 : "+ result);

		
	}//main메소드
	
	//두수를 더해서 리턴해주는 메소드
	static int add(int num1, int num2) {
		int result = num1+num2;//결과값
		return result;
	
	}
	//int 리턴다입  없을 떄 void
	
	
	

}
//===============================================================
//		for(int i=0; i<10; i++) {
//			num1 += i;
//		}
//		
//		for(int i=0; i<11; i++) {
//			num1 += i;
//		}