import java.util.Arrays;

public class Ex5_5 { //배열 로또번호 구하기 

	public static void main(String[] args) {
		int[] ball = new int[45]; //45개의 정수값을 저장하기
		
		for(int i = 0; i < ball.length; i++) { //배열의 각 요소에 1~45의 값을 저장한다. 
			ball[i] = i + 1;              // ball[0]에 1이 저장된다.
		}
		System.out.println(Arrays.toString(ball));
		
		int tmp = 0; // 두 값을 바꾸는데 사용할 임시변수(빈 컵)
		int j = 0;  // 난수 값을 저장할 변수
		
		for(int i = 0; i < 6; i++) { //0번째부터 6개만 바꾼다.
			j = (int)(Math.random()*45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		for(int i = 0; i < 6; i++)
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		
	}
}
