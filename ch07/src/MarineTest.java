
public class MarineTest {

	public static void main(String[] args) {
		Marine m = new Marine();
		m.move(3, 2);
		m.stimPack();
		m.stop();
		
		Unit u = new Marine();
		u.move(3, 3);
//		u.stimPack();  에러! Unit추상클래스에 stimPack()메소드 없음
		u.stop();

	}
}
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("정지하였습니다.");
	}
}

class Marine extends Unit{
	void move(int x, int y) {
		System.out.println(x + "," + y + "해변으로 이동하였습니다.");
	}
	void stimPack() {
		System.out.println("스팀팩을 사용하였습니다.");
	}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println(x + "," + y + " 지면으로 이동하였습니다.");
	}
	void changeMode() {
		System.out.println("공격모드를 변환합니다.");
	}
}

class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println(x + "," + y + " 공중으로 이동하였습니다.");
	}
	void load() {
		
	}
	void unload() {}
}