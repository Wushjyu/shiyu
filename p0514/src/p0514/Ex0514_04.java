package p0514;

import java.util.Scanner;

public class Ex0514_04 {

	public static void main(String[] args) {
		// 1.화면단 출력 -while(),switch()구문 먼저 만들것
		// 2.학생성적추가 부분을 구현
		// - 각각의 저장 배열열을 생성
		//- 이름,국어, 영어, 수학점수 입력받음
		//-합계,평균 입력
		//3. 학생 성적출력을 구현
		Scanner scan = new Scanner (System.in);
		String [] name = new String [10];
		int [][] score = new int[10][4];
		double [] avg = new double [10];
		int count = 0;
		
		 while (true) {
			 System.out.println("학생정보메뉴입니다.");
			 System.out.println("1.학생정보추가");
			 System.out.println("2.학생정보수정");			 
			 System.out.println("3.학생정보수정");
			 System.out.println("원하는 번호 입력하세요");
			 
			 int win = scan.nextInt();

			 switch(win) {
			 case 1:
				 System.out.println("학생정보추가메뉴");
				 
				 for (int i =count; i<name.length; i++) {
					 System.out.println("학생이름입역하세여");
					 name [i] = scan.next();
					 for (int j=0; j<(score.length-1); j++) {
						 System.out.println("점수를 입력하세여");
						 score[i][j] = scan.nextInt();
						 }
					 score[i][3]= score[i][0]+score[i][1]+score[i][2];
					 avg[i] = score[i][3]/3.0;
					 count++;
					 }
			
			 case 3:
				 System.out.println("이름\t국어\t영어\t수학\t총점\t평균점수\n");
				 System.out.println("-------------------------------");
				 
				 for (int i =0; i<name.length; i++) {
					 System.out.print(name[i]+"\t");
					 for(int j=0; j<score[i].length; j++) {
						 System.out.print(score[i][j]+"\t");
					 }
					 System.out.print(avg[i]+"\t");
					 System.out.println();
				 
				 
				 
			 }
			 }
			 
		 
			 
		 }

	}

}
