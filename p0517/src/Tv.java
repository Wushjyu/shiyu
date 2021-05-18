

public class Tv {
    //속성 변수
	String color;
	boolean power;//on/off- 0/1
	int channel; //3=tvn 5=sbs 7-kbs 11-mbc
	//기능 메서드
	void power() {power = !power;} //false,true	
	void channelup() {channel++;}
	void channelDown() {channel--;}
	
}