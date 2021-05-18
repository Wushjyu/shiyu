package p0514;

public class Ex0514_01 {

	public static void main(String[] args) {
		// 1차원 30개짜리 배열 생성해서 랜덤으로 1~100까지 숫자를 넣어 만들어
		// 1차원 40개짜리 배열을 생성해서 배열 5번째방부터 20개만 복사해
        // for문, arraycopy메소드 2가지를 모두 사용	
		//8년치
	    
		
//		int[] number = new int [30];
//		int[] newNumber = new int[40];
//		
//		for(int i=0; i<number.length;i++) {
//			number[i] = (int)(Math.random()*100);
//		
//		}
//		//for문 배열복사
////		for(int i=4; i<24;i++) { //0,1,2,3,4
////			newNumber[i] = number[i];		
////		}
//			
//		//arraycopy메소드 배열복사
////		System.arraycopy(number, 4, newNumber, 0, 20);
//
//		//출력
//		for(int i=0; i<newNumber.length;i++) {
//			System.out.println(newNumber[i]);
//		}
		
		
//----------------------------------------------------------------------------------------		
		
//		//System.arraycopy()메소드 사용해서 배열복사 1방법
//		int[] number = {1,2,3,4,5};
//		int[] newNumber = new int[10];			
//		
//		System.arraycopy(number, 2, newNumber, 5, 2);
//		//number, 2(number1의 어느위치부터 복사), newNumber, 5(newNumber의 어느위치에서 붙여), 2(몇개?) 
//		
//		for(int i=0; i<newNumber.length;i++) {
//			System.out.println(newNumber[i]);
//		}
		
		
		
		//for사용한 배열 복사 2방봅
//		int[] number = {1,2,3,4,5};
//		int[] newNumber = new int[10];
//		
//		for(int i=0; i<number.length;i++) {
//			newNumber[i] = number[i];
//		}
//		for(int i=0; i<newNumber.length;i++) {
//			System.out.println(newNumber[i]);
//		}

		
		//==================================================
		
		int[][]score = new int[3][4];//[행][열]
		System.out.println("score :"+ score.length);
		System.out.println("score[i] :"+ score[2].length);
	    
//		score.length는 행을 얘기하는 거야; 
//	    score[3].length 가운데 []를 붙이면 열을 얘기하는 거야;score[3].length는 i행의 열개수가 몇개인지 얘기하는 거야.
//      length에서만!!!
		
		
		
//		for(int i=0; i<title.length; i++) {//
//			System.out.print(title[i]+"\t");   length를 붙이지 않았으니까, 행을 얘기하는 거냐
//		}
		
		
		
		
		
	}//main
}//end
