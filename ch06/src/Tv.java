
class Tv {
	
	String color;	// 색상
	boolean power;	// 전원상태 (on/off)
	int channel;	// 채널
	
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

class TvTest {
	public static void main(String[] args) {
//		Tv t = new Tv();
		
		Tv t;
		t = new Tv();
		
		t.channel = 7;
		t.channelDown();
		System.out.println(t.channel);  //6
		System.out.println(t);
	}
}
