package pack01;

public class Lotto_process {
	
	//로또번호 생성 메소드
	void lotto_insert(int[] ball) {
		for(int i=0;i<ball.length; i++) {
		    ball[i] = i+1;	
		}
		System.out.println("45개 번호가 생성되었습니다.");
	}//lotto_insert
	
	void lotto_random(int[] ball) {
		int temp =0;
		for(int i=0; i<500; i++) {
			int random = (int)(Math.random()*45);//0-44
			temp = ball[0];
			ball[0] = ball[random];
			ball[random] = temp;
		}
		System.out.println("로또 번호 섞기가 완료되었습니다.");
	}

}
