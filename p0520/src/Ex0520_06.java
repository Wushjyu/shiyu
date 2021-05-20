import java.util.Scanner;

public class Ex0520_06 {

	public static void main(String[] args) {
		// 실수를 입력받아 -> 반올림(round), 올림 - ceil(), 버림-floor()
		// main()-> 실수 입력, myMath메소드 호출 return받아 호출;
		// myMath메소드 -> 반올림해서 return 돌려줌
		Scanner scan = new Scanner(System.in);
		System.out.println("실수를 입력하세요");
		double num1 = scan.nextDouble();//3.1415926
		
		long result = myMath(num1);
		double result2 = myMath(num1);
		double result3 = myMath(num1);
		
		System.out.println("반올림 : "+ result);
		System.out.println("올림 : "+ result2);
		System.out.println("버림 : "+ result3);

	}
	// long myMath(줄 떄) (double num1)(받을때)//리턴할 떄 주는 
	static long myMath (double num1) {//리턴할 떄 주는 
		long result = Math.round(num1);//long
				return result;
	}
	static double myMath2 (double num1) {
		double result = Math.ceil(num1);//double
				return result;
	}
	static double myMath3 (double num1) {
		double result = Math.floor(num1);//double
				return result;
	}

}
