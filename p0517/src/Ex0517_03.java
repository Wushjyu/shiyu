import java.util.Scanner;

public class Ex0517_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String [] name = new String [5];
		int [][] score = new int [5][4];
		double [] avg = new double [5];
		int [] rank = new int [5];
		String [] title = {"이름","국어","영어","수학","총점","평균점","등수"};
		int count = 0;
		String check = ""; 
		int findname = 0;
		int findnum = 0;
		
		
		while(true) {
			
			
		
			System.out.println("---------------------------");
			System.out.println(" [ 학생성적처리 프로그램 ]");
			System.out.println("---------------------------");
			System.out.println("1.학생성적추가");
			System.out.println("2.학생성적출력");
			System.out.println("3.학생성적수정");
			System.out.println("4.학생성적검색");//중복하게 변경
			System.out.println("5.등수처리");
			System.out.println("6.학생성적 프로그램종료");
			System.out.println("---------------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			
			
			
			
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println(" [ 학생성적추가메뉴 ] ");
				for(int i=count; i<name.length; i++) {
					
					System.out.println(" 학생이름을 입력하세요.(0번은 메인메뉴로 돌아가기!) ");
					name[i] = scan.next();
					if (name[i].equals("0")) {
						System.out.println(" 찾고자 하는 데이터가 없습니다. ");
						break;
					}
					for(int j=0; j<(score[i].length-1); j++){
						System.out.println(title[j+1]+"성적을 입력하세요.");
						score[i][j] = scan.nextInt();
					}
					score[i][3] = score[i][0]+score[i][1]+score[i][2];
					avg[i] = score[i][3]/3.0; 
					count++;
				}
				break;
			case 2:
				System.out.println(" [학생성적출력메뉴] ");
				for(int i=0; i<title.length; i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				for(int i=0; i<name.length; i++) {
					System.out.print(name[i]+"\t");
					for(int j=0; j<score[i].length; j++) {
						System.out.print(score[i][j]+"\t");
					}
					System.out.print(avg[i]);
					System.out.println();
				}
				break;
			case 3:
				System.out.println(" [ 학생정보수정메뉴 ] ");
				System.out.println(" 찾고자 하는 학생이름을 입력하세요. ");
				check = scan.next();
				findname = -1;
				for (int i=0; i<count; i++) {
					if(check.equals(name[i])) {
						findname = i;
						break;
					}
				}
				if(findname == -1) {
					System.out.println("찾고자 하는 데이터가 없습니다.");
					break;
				}
				System.out.println(" 0.국어; 1.영어; 2.수학 "+"\n"+" 수정하고자 하는 과목을 선택하세요. ");
				findnum = scan.nextInt();
				System.out.println("현재점수는 : "+score[findname][findnum]);
				System.out.println("수정하고자 하는 점수를 입력하세요.");
				score[findname][findnum]= scan.nextInt();
				score[findname][3]=score[findname][0]+score[findname][1]+score[findname][2];
				avg[findname]= score[findname][3]/3.0;
				System.out.println("수정완료되었습니다.");

				break;
				
				
			case 4:
				System.out.println("검색하려고 하는 이름을 입력하세요.");
				check = scan.next();
				findname = -1;
				for(int i=0; i<count; i++) {
					if(check.equals(name[i])) {
						findname = i;
						break;
					}
				}
				if(findname == -1) {
					System.out.println("찾고자 하는 학생이 없습니다.");
					break;
				}
				for(int i=0; i<title.length; i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("--------------------------");
				
				for(int i=0; i<count; i++) {
					System.out.print(name[i]+"\t");
					for
				}
				
				
				break;
				
				
			case 5:
				break;
				
				
			case 6:
				
				break;
				
				
			default:
				break;
				
				
		
		
			
			}
		
		}//while
	}//main
}//class
