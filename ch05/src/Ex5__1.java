import java.util.Arrays;  // (command + shift + o) 자동으로 import문 추가

public class Ex5__1 {

	public static void main(String[] args) {
		int[] iArr = {100, 95, 80, 70, 60};
		
		//for문을 이용해서 배열 출력
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		//Arrays클래스의 toString()메서드를 이용해서 배열 출력
		System.out.println(Arrays.toString(iArr));
	}
}
