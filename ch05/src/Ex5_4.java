import java.util.Arrays;

public class Ex5_4 { //배열 활용. 배열을 섞기

	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i < 100; i++) { //0~99까지 반복한다. (100번 섞는다)
			int n = (int)(Math.random()*10); //0~9중에 랜덤값을 n에 저장한다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
	}
}
