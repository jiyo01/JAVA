
public class SumAvg { //배열의 총합과 평균 구하기.

	public static void main(String[] args) {
		int sum = 0;    // 총합을 저장하기 위한 변수
		float average = 0;  // 평균을 저장하기 위한 변수
		
		int[] score = {100, 88, 100, 100, 90};
		
		/*
		sum += score[0];
		sum += score[1];
		sum += score[2];
		sum += score[3];
		sum += score[4]; 
		*/ 
		
		for(int i = 0; i < score.length; i++) { //위에 식을 반복문으로 한다.
			sum += score[i];
		}
		
		average = sum / (float)score.length;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);

	}
}
