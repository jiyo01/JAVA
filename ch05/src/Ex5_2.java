
public class Ex5_2 {

	public static void main(String[] args) {
		// 배열의 총합과 평균을 구한다.
		
		int sum = 0;         // 총합을 저장하기 위한 변수
		float average = 0f;  // 평균을 저장하기 위한 변수
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (float)score.length;
//		average = (float)sum / score.length;  이렇게 어느쪽에든 형변환 연산자 붙여도 된다.
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
	}
}
