
public class Ex4_8 {

	public static void main(String[] args) {
		
		// 조건식을 생략하면, true로 간주되어서 무한반복문이 됨
		for(int i = 1; i <= 10; i++) { // 괄호{}안의 문장을 10번 반복
			System.out.println("Hello");
		}
		//System.out.println(i); 에러. 변수 i가 선언되지 않았다.
	}
}
