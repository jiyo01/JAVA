class MyPoint{
	int x;
	int y;
}

//class Circle extends MyPoint{  // 상속 
//	int r;
//}

class Circle {  // 포함
	MyPoint p = new MyPoint();
	int r;
}

public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();  // 이 코드를 그림으로 그려보면 이해가 된다.
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x=" + c.p.x);
		System.out.println("c.p.y=" + c.p.y);
		System.out.println("c.r=" + c.r);

	}
}
