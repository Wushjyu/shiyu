import java.util.Scanner;

public class Ex0520_07 {

	public static void main(String[] args) {

        //두수를 입력받아 결과값을 출력->cal()메소드호출
		//cal()->더하기,빼기 출력
		
		Scanner scan = new Scanner(System.in);
		SignData s = new SignData();
		System.out.println(s);
		System.out.println("두수를 입력하세요");
		s.num1 = scan.nextInt();//3
		s.num2 = scan.nextInt();//5
	    
		//System.out.println("main"+s);
	    cal(s);
	    
	    System.out.println("두수 더하기 : "+ s.result1);
	    System.out.println("두수 뺴기 : "+ s.result2);
	    System.out.println("두수 곱하기 : "+ s.result3);
	    System.out.println("두수 나누기 : "+ s.result4);
	}
    static void cal(SignData s1) {
    	//System.out.println("cal"+s1);
	    s1.result1 = s1.num1+s1.num2;
	    s1.result2 = s1.num1-s1.num2;
	    s1.result3 = s1.num1*s1.num2;
	    s1.result4 = s1.num1/s1.num2;

}
}
