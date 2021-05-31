package pack01;

import java.util.Scanner;

public class Process01 {
	static Scanner scan = new Scanner(System.in);//인스턴스 변수-> 클래스 변수

	//numInput메소드
	int[] numInput() {
		int[] num = new int[2];
		for(int i=0; i<num.length; i++) {
			System.out.println((i+1)+"번째 수를 입력하세요");
			num[i] = scan.nextInt();			
		}	
		return num;	
	}//numInput메소드

//------------------------------------	
	
	//더하기 메소드
	int add(int num1,int num2) {//인스턴스 메소드//계산
		int result = num1+num2;
		return result;		
			
	}//더하기 메소드
	
	//합계 메소드
	int numBetween(int num1, int num2) {
		int sum = 0;//합계변수
		for(int i=num1; i<=num2; i++) {//5,10
			sum =sum + i;//공식
		}
		return sum;
	}//합계 메소드
	
	//두수 비교
	String numCompare(int num1, int num2) {
		String str ="";
			if(num1<num2) {
				str = "큰수 :"+num2+","+"작은 수 : "+num1;
			}else if(num1>num2) {					
				//System.out.printf("큰수 : %d, 작은 수 : %d\n", num1,num2);
				str = "큰수 :"+num2+","+"작은 수 : "+num1;
			}else {
				str = "두수 크기가 같은 : "+num1;
			}
			return str;
	}
}//class
//학생성적추가/scanner->while->switch->배열->입력과정(for문->이름.국어.공간.입력)