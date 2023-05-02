
class Tv {

	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv {
	
	String text;	// 캡션(자막)을 보여주기 위한 문자열
	void caption() {
		/* 내용 생략 */
	}
}

