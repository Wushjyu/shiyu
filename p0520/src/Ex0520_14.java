import java.util.Scanner;

public class Ex0520_14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Student [] s = new Student[10];
		String check_Name = "";
		int check_Num = 0;
		
		loop1:while(true) {
			System.out.println("[학생정보메인메뉴]");
			System.out.println("1.학생정보 추가");
			System.out.println("2.학생정보 출력");
			System.out.println("3.학생정보 수정");
			System.out.println("4.학생정보 검색");
			System.out.println("5.학생 등수 처리");
			System.out.println("0.프로그램 종료");
			int choice = scan.nextInt();
			switch(choice){
				case 1:
					for(int i=Student1.count; i<s.length; i++) {
						System.out.println("입력하고싶은 학생의 이름을 입력하세요(0번은 메인메뉴)");
						String check = scan.next();
						if(check.equals("0")) {
							System.out.println("상위메뉴로 이동.");
							break;
						}
						s[i] = new Student();
						s[i].name = check;
						System.out.println("국어점수를 입력하세요");
						s[i].kor = scan.nextInt();
						System.out.println("영어점수를 입력하세요");
						s[i].eng = scan.nextInt();
						System.out.println("수학점수를 입력하세요");
						s[i].math = scan.nextInt();
						s[i].total = s[i].kor+s[i].eng+s[i].math;
						s[i].avg = s[i].total/3.0;
					}	
					break;
				case 2:
					System.out.println("[학생정보메뉴]");
					System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균점\t등수\n");
					System.out.println("--------------------------------------------");
					for(int i=0; i<Student.count; i++) {
						System.out.print(s[i].student_Num+"\t");
						System.out.print(s[i].name+"\t");
						System.out.print(s[i].kor+"\t");
						System.out.print(s[i].eng+"\t");
						System.out.print(s[i].math+"\t");
						System.out.print(s[i].total+"\t");
						System.out.print(s[i].avg+"\t");
						System.out.print(s[i].rank+"\n");
					}
					break;
				case 3:
					System.out.println("수정하고싶은 이름을 입력하세요");
					check_Name = scan.next();
					check_Num = -1;
					for (int i=0; i<Student.count; i++) {
						if(s[i].name.contains(check_Name)) {
							System.out.println(i+"."+s[i].name);
							check_Num = 0;
						}
					}
					if(check_Num ==-1) {
						System.out.println("수정할 데이터가 없습니다.");
						break;
					}
					System.out.println("수정하고 싶은 학생의 번호를 선택하세요");
					int temp_Num1 = scan.nextInt();
					System.out.println("수정하고 싶은 번호를 선택하세요");
					System.out.println("1.국어 2.영어 3.수학");
					System.out.println("번호를 선택하세요");
					int temp_Num2 = scan.nextInt();
					switch(temp_Num2) {
					case 1:
						System.out.println("현재점수: "+ s[temp_Num1].kor);
						System.out.println("수정하고싶은 점수를 입력하세요");
						s[temp_Num1].kor= scan.nextInt();
						break;
					case 2:
						System.out.println("현재점수: "+ s[temp_Num1].eng);
						System.out.println("수정하고싶은 점수를 입력하세요");
						s[temp_Num1].eng= scan.nextInt();
						break;
					case 3:
						System.out.println("현재점쉬: "+ s[temp_Num1].math);
						System.out.println("수정하고싶은 점수를 입력하세요");
						s[temp_Num1].math = scan.nextInt();
						break;
					}
					s[temp_Num1].total = s[temp_Num1].kor+s[temp_Num1].eng+s[temp_Num1].math;
					s[temp_Num1].avg = s[temp_Num1].total/3.0;
					System.out.println("수정완료되엇습니다.");
				    break;
				case 4:
					System.out.println("검색할 학생의 이름을 입력하세요");
					check_Name = scan.next();
					
					System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균점\t등수\n");
					check_Num = -1;
					for(int i=0; i<Student.count; i++) {
						if (s[i].name.contains(check_Name)) {
							System.out.println(s[i].student_Num);
							System.out.println(s[i].name);
							System.out.println(s[i].kor);
							System.out.println(s[i].eng);
							System.out.println(s[i].math);
							System.out.println(s[i].total);
							System.out.println(s[i].avg);
							System.out.println(s[i].rank);
						}
					}
					if(check_Num == -1) {
						System.out.println("검색할 데이터가 없습니다.");
					}
					break;

				case 5:
					for(int i=0; i<Student.count; i++) {
						int rankNum = 1;
						for(int j=0;j<Student.count;j++) {
							if (s[i].total<s[j].total) {
								rankNum ++;
							}
						}
						s[i].rank = rankNum;
					}
					System.out.println("등수처리 완료되었스비나.");
					break;
				case 0:
					System.out.println("프로그램 종료");
					break loop1;
					
			}//switch
			
		}//while

	}//main

}//end
