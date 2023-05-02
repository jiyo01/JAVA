package test;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		String str = new String("KOREA");
		Date today = new Date();
		
		System.out.println(str);   // 참조변수 str을 넣고 출력하면 str.toString()을 출력한것과 같다.
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
	}
}
